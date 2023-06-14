SUMMARY = "PLplot functions for scientific plotting with qt"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the development files for using PLplot \
with Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotqt-devel-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "1b95250c39f00b47a4c0a10b4c5f49d330411bc50727e4f7bb6b473a6b609b7ed8470431cd08da74bb82a5d7f6aa22f6e2ff7509686360edf768c57021473647"

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
