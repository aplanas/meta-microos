SUMMARY = "Library for querying public transport data onboard trains"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
transport journey queries. This package contains a library to determine \
the presence onboard of a train using WiFi SSIDs and provide journey \
details."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKPublicTransportOnboard1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "52ccafe3bae3056fed2fbb33c52dc4d9f43cba8c34804cb31ef775cd7419fa283e695a40c36635883e46547a9198a1cbe3195fa629b40b872cbe7bab862bce6a"

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
