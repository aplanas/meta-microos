SUMMARY = "Math Expression Solver and Plotter - mobile version"
DESCRIPTION = "KAlgebra is a math expression solver and plotter. This package includes \
a QtQuick based version for use in mobile (phone, tablet) environments."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kalgebra-mobile-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "12912aa99c6be18c2dd79e66ea35d574748f6133cfd7582dc723e93ee7428984667df01032d15806ed17f15c65eede05928254930a1cfbeafd461405436d0e26"

RPROVIDES:${PN} += "kalgebra-mobile"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libAnalitza.so.8 \
libAnalitzaPlot.so.8 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
