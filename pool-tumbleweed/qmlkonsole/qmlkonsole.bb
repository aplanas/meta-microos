SUMMARY = "Terminal application"
DESCRIPTION = "Terminal application offering additional keyboard buttons useful on touch \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "qmlkonsole-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6a8ae0f0649123d8eb043386fa1e88425a64ead5e27ab2aef7f7de3efbe70d9445fccb40ddbef929556f51b53ffa9b74ee25bbd51f053b5a26233bd45b6292f9"

RPROVIDES:${PN} += "qmlkonsole"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qmltermwidget"

inherit rpm
