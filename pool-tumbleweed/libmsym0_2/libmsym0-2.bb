SUMMARY = "Molecular point group symmetry library"
DESCRIPTION = "A C library dealing with point group symmetry in molecules."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "libmsym0_2-0.2.3-2.5.aarch64.rpm"
RPM_HASH = "d32a74ec7dc4d3f81d1dc96648423563aba8437b895985ea93189cfdc327154191c29390746371c12845b5043f8743af9162decd26b26e891ed2a93c0d87e54a"

RPROVIDES:${PN} += "libmsym.so.0.2()(64bit) \
libmsym0_2 \
libmsym0_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
