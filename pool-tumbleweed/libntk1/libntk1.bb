SUMMARY = "Shared library files for non-ntk"
DESCRIPTION = "This package contains shared libraries for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "libntk1-1.3.1001-1.6.aarch64.rpm"
RPM_HASH = "c1188dda74f47c754fe9be838ccd330b9ead2a6437f7f009c7d15ecf35e24148e89bd80ffa96d9e6ce615ff670ed4c7958ae09739cff7cde74fa13e0d9beed07"

RPROVIDES:${PN} += "libntk.so.1()(64bit) \
libntk1 \
libntk1(aarch-64) \
libntk_gl.so.1()(64bit) \
libntk_images.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
