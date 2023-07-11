SUMMARY = "Basic Linear Algebra Communication Subprograms"
DESCRIPTION = "The BLACS (Basic Linear Algebra Communication Subprograms) project \
provides a linear algebra oriented message passing interface for \
a large range of distributed memory platforms. \
 \
The length of time required to implement efficient distributed memory \
algorithms makes it impractical to rewrite programs for every new \
parallel machine. The BLACS exist in order to make linear algebra \
applications both easier to program and more portable."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi4-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "1d84f5661deebe6f6b67b1d37fc3fcbf050ebed80dee5dc78ae9d4911cd59a212f4354fa72e40826da926617987ebf7bfaaf583dd456bdd42340cb8577ba88ca"

RPROVIDES:${PN} += "libblacs.so.2.1.0 \
libblacs2-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40"

inherit rpm
