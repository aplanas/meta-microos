SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains shared libraries."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libm17n0-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "f962e9be06bd5042c43d093779e3ac5607d8aa23c5a22149355fa19ad6fc2ca38542fc83c6686c8a148e4482b7a876b4c807c6eedd1a155b6dd3471177f777e6"

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
