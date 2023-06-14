SUMMARY = "Public transport assistant targeted towards mobile Linux and Android"
DESCRIPTION = "KTrip is a public transport assistant targeted towards mobile Linux and \
Android. It allows to query journeys for a wide range of countries/public \
transport providers by leveraging KPublicTransport."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktrip-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5bea8e9a4b463be107b25be409f3aee2abc11a4af38970150a37fbc020d2986e6fcc6f9efdfac8d86b4fe5c09f3d5ce558f21bbd714e17e14270f1af5ad4d129"

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
