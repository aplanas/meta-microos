SUMMARY = "A zoomable user interface (ZUI) with file manager, file viewers, games, etc."
DESCRIPTION = "Eagle Mode is an implementation of a futuristic style of man-machine \
communication in which the user can visit almost everything simply by \
zooming in. It has a file manager, file viewers and players for most \
of the common file types, a chess game, a 3D mines game, a netwalk \
game, a multi-function clock and some fractal fun, all integrated in \
a virtual cosmos. That cosmos also provides a Linux kernel \
configurator in form of a kernel patch. \
 \
It features a separate popup-zoomed control view, help texts in the \
things they are describing, editable bookmarks, multiple input \
methods, anti-aliased graphics, a virtually unlimited deep panel \
tree, and a C++ API."
LICENSE = "GPL-3.0-only"

PV = "0.96.0"

RPM_NAME = "eaglemode-0.96.0-2.1.aarch64.rpm"
RPM_HASH = "b3fd23510f1584495f7776afb60769bada04d45a46c1c3429fe375e947bfb1471fe0ad1f8c1392a2d0612d8526df2d429821dc7e5fb80b7ae6da306d3fa28241"

RPROVIDES:${PN} += "eaglemode \
libSilChess.so \
libemAv.so \
libemBmp.so \
libemClock.so \
libemCore.so \
libemFileMan.so \
libemFractal.so \
libemGif.so \
libemIlbm.so \
libemJpeg.so \
libemMines.so \
libemNetwalk.so \
libemPcx.so \
libemPdf.so \
libemPng.so \
libemPnm.so \
libemPs.so \
libemRas.so \
libemRgb.so \
libemStocks.so \
libemSvg.so \
libemTestPanel.so \
libemText.so \
libemTga.so \
libemTiff.so \
libemTmpConv.so \
libemTreeDump.so \
libemX11.so \
libemXbm.so \
libemXpm.so \
perl-PlEx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
abiword \
binutils \
bzip2 \
gcc \
gedit \
ghostscript-x11 \
gzip \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libpoppler-glib.so.8 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libvlc.so.5 \
lzop \
p7zip-full \
perl \
tar \
texlive-bin-dvilj \
transfig \
unzip \
xorg-x11 \
xterm-bin \
zip"

inherit rpm
