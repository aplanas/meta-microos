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

RPM_NAME = "libblacs2-mvapich2-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "8dfbaf8b325d69a951a9bdaf2413e7e21da818dfbd02559beb1741b57150890365fc4c5ec23ad952247138c2187532b88bcbecfb61c649b1cd01b6c9fa348d26"

RPROVIDES:${PN} += "libblacs.so.2.1.0 \
libblacs2-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
