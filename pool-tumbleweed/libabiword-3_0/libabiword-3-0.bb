SUMMARY = "A Multiplatform Word Processor - Library files"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "libabiword-3_0-3.0.5-2.9.aarch64.rpm"
RPM_HASH = "7b2affd12699fd1b8421e27d0ec9a23c98d9b104dfebde7bd80a32b552922930a0da5024abf2c38d4375fceab183ba6b16ea3b4aa03a305e7472df14e5220bab"

RPROVIDES:${PN} += "libabiword-3-0 \
libabiword-3.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libenchant.so.1 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoffice-0.10.so.10 \
libgsf-1.so.114 \
libgtk-3.so.0 \
libjpeg.so.8 \
liblink-grammar.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librevenge-0.0.so.0 \
librsvg-2.so.2 \
libstdc++.so.6 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libwpd-0.10.so.10 \
libwpg-0.3.so.3 \
libwps-0.4.so.4 \
libwv-1.2.so.4 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1"

inherit rpm
