SUMMARY = "Math Expression Solver and Plotter"
DESCRIPTION = "KAlgebra is a math expression solver and plotter."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalgebra-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "60bea48346b7b163405eff5c426e786b9d24f65152addceb6616bfd3071a5d5687bf641165f9ea1208f762ccb5a5b08298832dfdf85eb74901b248f4b31d59f0"

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
