SUMMARY = "A Multiplatform Word Processor - Library files"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "libabiword-3_0-3.0.5-2.9.aarch64.rpm"
RPM_HASH = "7b2affd12699fd1b8421e27d0ec9a23c98d9b104dfebde7bd80a32b552922930a0da5024abf2c38d4375fceab183ba6b16ea3b4aa03a305e7472df14e5220bab"

RPROVIDES:${PN} += "libabiword-3.0.so()(64bit) \
libabiword-3_0 \
libabiword-3_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libenchant.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgoffice-0.10.so.10()(64bit) \
libgsf-1.so.114()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblink-grammar.so.5()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librevenge-0.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libwmf-0.2.so.7()(64bit) \
libwmflite-0.2.so.7()(64bit) \
libwpd-0.10.so.10()(64bit) \
libwpg-0.3.so.3()(64bit) \
libwps-0.4.so.4()(64bit) \
libwv-1.2.so.4()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
