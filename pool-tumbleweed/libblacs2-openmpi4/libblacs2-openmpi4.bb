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

RPM_NAME = "libblacs2-openmpi4-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "0a988f250de6e0fdb20cdcf724232a5a510aa31dc3f6e5013848abd6ab8760fbea9f48977f45c6aa8c663a646e6438b608083bd564aea15c520604be5a4c6d2a"

RPROVIDES:${PN} += "libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi4 \
libblacs2-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmpi.so.40()(64bit)"

inherit rpm
