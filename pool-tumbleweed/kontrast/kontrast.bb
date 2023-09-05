SUMMARY = "Contrast checker"
DESCRIPTION = "Kontrast allows choosing background and text color that are easy to read when \
used together."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "kontrast-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3c7554a62444c21a592557891196ab9d12990d4c0b64534a5c7119d2aacc8fd08ae24674e80d66bf833abd0a3b1e4a7549c58a1eafc296d9b89a22725b966024"

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
libfuturesql5.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libqt5-qtquickcontrols \
libstdc++.so.6"

inherit rpm
