SUMMARY = "Contrast checker"
DESCRIPTION = "Kontrast allows choosing background and text color that are easy to read when \
used together."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "kontrast-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "63d17cecd660a2c8cbe1881f6a00fdaea681c466e59034de8ceb0fdc12032e09230326d19875ba05be79416da7f2503829ff994c22729f85bc8a52537838af73"

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
