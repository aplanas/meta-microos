SUMMARY = "Terminal application"
DESCRIPTION = "Terminal application offering additional keyboard buttons useful on touch \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "qmlkonsole-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "afa31c9b62d5758aae429bcd734fdec86a808c0cab18949a23e82d596cad927829d9f9d1818329b8d1010f6d7a59cd79b47ba3ac6cd8eee70ba00cc43afc11c1"

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
