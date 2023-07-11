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

RPM_NAME = "libblacs2-openmpi2-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "c6f091e6086ad55f3a3aa4d3c45a1250ca3d242a1f9f1ad1de8f624e7d81daa1301de1ac575e2825fd6d863ab5c1e6de93f1eba6f78aa42094e81fe76e690024"

RPROVIDES:${PN} += "libblacs.so.2.1.0 \
libblacs2-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.20"

inherit rpm
