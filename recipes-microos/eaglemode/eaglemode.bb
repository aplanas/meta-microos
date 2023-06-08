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

RPROVIDES:${PN} += "application() application(eaglemode.desktop) eaglemode eaglemode(aarch-64) libSilChess.so()(64bit) libemAv.so()(64bit) libemBmp.so()(64bit) libemClock.so()(64bit) libemCore.so()(64bit) libemFileMan.so()(64bit) libemFractal.so()(64bit) libemGif.so()(64bit) libemIlbm.so()(64bit) libemJpeg.so()(64bit) libemMines.so()(64bit) libemNetwalk.so()(64bit) libemPcx.so()(64bit) libemPdf.so()(64bit) libemPng.so()(64bit) libemPnm.so()(64bit) libemPs.so()(64bit) libemRas.so()(64bit) libemRgb.so()(64bit) libemStocks.so()(64bit) libemSvg.so()(64bit) libemTestPanel.so()(64bit) libemText.so()(64bit) libemTga.so()(64bit) libemTiff.so()(64bit) libemTmpConv.so()(64bit) libemTreeDump.so()(64bit) libemX11.so()(64bit) libemXbm.so()(64bit) libemXpm.so()(64bit) perl(PlEx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl abiword binutils bzip2 gcc gedit ghostscript-x11 gzip ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpoppler-glib.so.8()(64bit) librsvg-2.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libvlc.so.5()(64bit) lzop p7zip-full perl tar texlive-bin-dvilj transfig unzip xorg-x11 xterm-bin zip"

inherit rpm
