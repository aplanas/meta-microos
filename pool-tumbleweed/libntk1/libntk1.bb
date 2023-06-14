SUMMARY = "Shared library files for non-ntk"
DESCRIPTION = "This package contains shared libraries for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "libntk1-1.3.1001-1.6.aarch64.rpm"
RPM_HASH = "c1188dda74f47c754fe9be838ccd330b9ead2a6437f7f009c7d15ecf35e24148e89bd80ffa96d9e6ce615ff670ed4c7958ae09739cff7cde74fa13e0d9beed07"

RPROVIDES:${PN} += "libntk-gl.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libntk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
