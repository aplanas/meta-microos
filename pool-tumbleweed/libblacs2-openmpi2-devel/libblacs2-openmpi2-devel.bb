SUMMARY = "Development libraries for BLACS (openmpi2)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi2-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "d9016eed4ca2968d4d7b61762fc06916d1fb95163cf44479ffb6597d2a1e1cf66303448b0a5d8a8bcb9f6359c185efe3d8f3f11ecc36d5df0826855422defc08"

RPROVIDES:${PN} += "blacs-openmpi2-devel \
libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi2-devel \
libblacs2-openmpi2-devel(aarch-64)"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1()(64bit) \
libblacs2-openmpi2 \
libc.so.6()(64bit) \
libmpi.so.20()(64bit) \
openmpi2-devel"

inherit rpm
