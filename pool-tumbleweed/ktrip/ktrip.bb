SUMMARY = "Public transport assistant targeted towards mobile Linux and Android"
DESCRIPTION = "KTrip is a public transport assistant targeted towards mobile Linux and \
Android. It allows to query journeys for a wide range of countries/public \
transport providers by leveraging KPublicTransport."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ktrip-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "38e2642a74bb206bac019863ff6f6ff3aca2ef40a244fa73f3bed7e9f07938619fabf0ebdaba772d746a582fab24518c3af4cd62adc50adc8e3e44808cbe9a61"

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
