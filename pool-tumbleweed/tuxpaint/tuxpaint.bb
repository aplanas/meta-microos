SUMMARY = "Drawing Program for Young Children"
DESCRIPTION = "Tux Paint' is a drawing program for young children. It has a simple \
interface and fixed canvas size, and provides access to previous images \
using a thumbnail browser (it provides no access to the underlying \
filesystem). \
 \
Unlike drawing programs such as 'The GIMP', it has a very \
limited toolset. However, it provides a much simpler interface, and has \
entertaining, child-oriented additions such as sound effects."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.28"

RPM_NAME = "tuxpaint-0.9.28-1.1.aarch64.rpm"
RPM_HASH = "e80d06cc6861e655343d8661580d0864243068f9a42005ec3d355d7d0bc9963ae1f6dbe26cad75bd99f10bc10fe3d22765001a6a97c9186e46ad5e2e1d367c27"

RPROVIDES:${PN} += "config-tuxpaint \
tuxpaint"

RDEPENDS:${PN} += "/usr/bin/bash \
freefont \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-Pango.so.4 \
libSDL2-gfx-1.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libimagequant.so.0 \
libm.so.6 \
libpaper.so.2 \
libpng16.so.16 \
librsvg-2.so.2 \
libz.so.1 \
netpbm"

inherit rpm
