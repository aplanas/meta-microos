SUMMARY = "Math Expression Solver and Plotter"
DESCRIPTION = "KAlgebra is a math expression solver and plotter."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kalgebra-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d4f1340a7ddb1df6e7d48098a9b93c1c92a56062abede7a03f11b2cba983599b073fb78afa4c9b25ac3c565bb82ce7ef6e1fb8ef4975ff315c21d8d499632f3e"

RPROVIDES:${PN} += "kalgebra \
kalgebra5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAnalitza.so.8 \
libAnalitzaGui.so.8 \
libAnalitzaPlot.so.8 \
libAnalitzaWidgets.so.8 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.kde.analitza.1 \
qt5qmlimport-org.kde.plasma.components.2"

inherit rpm
