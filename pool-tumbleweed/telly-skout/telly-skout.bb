SUMMARY = "Kirigami TV guide"
DESCRIPTION = "Telly Skout is a convergent Kirigami TV guide. It shows the TV program for your \
favorite channels from TV Spielfilm or an XMLTV file."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "telly-skout-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "39fd6bb6030dd5f2421dc0af0bad61488c84da74c69e7907d0c75c4593069693f60f37a3c2d4745c4bf9dacae5ad22d32b014bc40328de5201c84912b45b30c2"

RPROVIDES:${PN} += "telly-skout"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
