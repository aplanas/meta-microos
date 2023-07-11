SUMMARY = "PLplot functions for scientific plotting with qt"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the development files for using PLplot \
with Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotqt-devel-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "41e87a0bd986be5bba1165241e0a7c2984005896b0aa46c6c5b7807aeeb25a6834b847b9383ce199c16876775fb6361de51cbb04320bce5feb2eb9b377427151"

RPROVIDES:${PN} += "pkgconfig-plplot-qt \
plplot-qt-devel \
plplotqt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libplplot.so.17 \
libplplotqt.so.2 \
libplplotqt2 \
libstdc++.so.6 \
pkgconfig \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Svg \
pkgconfig-Qt5Widgets \
pkgconfig-plplot \
plplot-common"

inherit rpm
