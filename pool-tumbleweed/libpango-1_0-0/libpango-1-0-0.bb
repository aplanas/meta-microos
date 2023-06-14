SUMMARY = "Library for Layout and Rendering of Text"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "libpango-1_0-0-1.50.14-1.3.aarch64.rpm"
RPM_HASH = "0c60d79316103347eaab20035c6ab31c947dbc8596dca3fc922c00aa15a4edd27c62000d3abe7f7a090862e4d3b41e486b99847dd273ee1abffe4776415d2bbc"

RPROVIDES:${PN} += "libpango-1-0-0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangoxft-1.0.so.0 \
pango \
pango-modules"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libthai.so.0"

inherit rpm
