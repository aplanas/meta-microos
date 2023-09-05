SUMMARY = "Library for querying public transport data onboard trains"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
transport journey queries. This package contains a library to determine \
the presence onboard of a train using WiFi SSIDs and provide journey \
details."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKPublicTransportOnboard1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f33d819cb2e1e839a5c663046ada499d771c77fd7e2cb572d98486f977da0e0ecf92bff197bd4eb1097ad3a914e1461b6e9b0e9ed9241772d1d68301b2c53f7d"

RPROVIDES:${PN} += "libKPublicTransportOnboard.so.1 \
libKPublicTransportOnboard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18nLocaleData.so.5 \
libKF5NetworkManagerQt.so.6 \
libKPublicTransport.so.1 \
libKPublicTransport1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
