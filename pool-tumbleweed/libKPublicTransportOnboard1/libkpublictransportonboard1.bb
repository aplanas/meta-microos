SUMMARY = "Library for querying public transport data onboard trains"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
transport journey queries. This package contains a library to determine \
the presence onboard of a train using WiFi SSIDs and provide journey \
details."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKPublicTransportOnboard1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ceae199593da642a21a1a532834227f04b8e039a0c753a4c500a2b1b5be7a2226e48c21ddada1573bb3e4b34722eadb2f92d9e4f764c6b4f29db73b4e3f70120"

RPROVIDES:${PN} += "libKPublicTransportOnboard.so.1 \
libKPublicTransportOnboard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18nLocaleData.so.5 \
libKPublicTransport.so.1 \
libKPublicTransport1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
