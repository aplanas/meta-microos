SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains shared libraries."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libm17n0-1.8.0-1.13.aarch64.rpm"
RPM_HASH = "8e585b7885bf08172493e5615ce298123f4f9417059428aa8eace102ae5bd9882962d5736c915e6ae11e7f5baf4eed0c17b9b0dd0e6a9cb62509c5a24e4e6ced"

RPROVIDES:${PN} += "libm17n-X.so \
libm17n-core.so.0 \
libm17n-flt.so.0 \
libm17n-gd.so \
libm17n-gui.so.0 \
libm17n.so.0 \
libm17n0 \
libmimx-anthy.so \
libmimx-ispell.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgd.so.3 \
libotf.so.1 \
libxml2.so.2 \
pkgconfig-m17n-db"

inherit rpm
