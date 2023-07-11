SUMMARY = "Public transport assistant targeted towards mobile Linux and Android"
DESCRIPTION = "KTrip is a public transport assistant targeted towards mobile Linux and \
Android. It allows to query journeys for a wide range of countries/public \
transport providers by leveraging KPublicTransport."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktrip-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8f85ca920045ea4f106af9fd750477067535b511f478ee83a118a4d3e17fc6e055b3c19e70ad52682f230a502b085f65bbceca4dbdcb82b48a40d39cc49dcb1f"

RPROVIDES:${PN} += "ktrip"

RDEPENDS:${PN} += "breeze5-icons \
kirigami2 \
kpublictransport \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPublicTransport.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
