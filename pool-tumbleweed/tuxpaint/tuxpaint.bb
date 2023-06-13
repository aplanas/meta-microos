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

RPROVIDES:${PN} += "application() \
application(tuxpaint.desktop) \
config(tuxpaint) \
tuxpaint \
tuxpaint(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
freefont \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_Pango.so.4()(64bit) \
libSDL2_gfx-1.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfribidi.so.0()(64bit) \
libimagequant.so.0()(64bit) \
libm.so.6()(64bit) \
libpaper.so.2()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit) \
libz.so.1()(64bit) \
netpbm"

inherit rpm
