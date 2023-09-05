SUMMARY = "Math Expression Solver and Plotter"
DESCRIPTION = "KAlgebra is a math expression solver and plotter."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalgebra-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "22c3151a5298ca0322a6adcfc91e0bbe9222e07f45eccacf060df4aa7af5dc8874821849742c2c6590e34450869b049187745972a59a4ae7bbba58a9ba8636fd"

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
