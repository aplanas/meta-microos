SUMMARY = "Contrast checker"
DESCRIPTION = "Kontrast allows choosing background and text color that are easy to read when \
used together."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "kontrast-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "375fae6729a8d1a82062933e572baaa67371fd471e5923abbde58c899de0f0ff6a30bc29b155f9a3e72161c167aa781a8badf9f216a603d625845b5d62a241bf"

RPROVIDES:${PN} += "kontrast"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libqt5-qtquickcontrols \
libstdc++.so.6"

inherit rpm
