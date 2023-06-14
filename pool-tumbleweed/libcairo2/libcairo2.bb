SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.17.8"

RPM_NAME = "libcairo2-1.17.8-1.1.aarch64.rpm"
RPM_HASH = "9ff031b7833a914ef41fd72b42e179bea5e262d6b8972ac4c4315139bdf9f1e0c437db113a54f5f10bb1b2be99ee22bc33edc1b1aa09c52626b98f86c58dfe90"

RPROVIDES:${PN} += "cairo \
libcairo.so.2 \
libcairo2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libxcb-render.so.0 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1"

inherit rpm
