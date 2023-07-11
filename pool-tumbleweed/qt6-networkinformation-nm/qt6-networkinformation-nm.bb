SUMMARY = "Network information for QNetworkInformation"
DESCRIPTION = "Plugin used to get network information such as the reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-networkinformation-nm-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c68bd2c6c9aabf162e454d4be06c2fa72e045b5a1bf1f9653e9e15edd21dcbf9806ed16fa93d629abb484f9d6d762b60f42c09dff23f6fa016590bc25581b26b"

RPROVIDES:${PN} += "libqnetworkmanager.so \
qt6-network-informationbackends \
qt6-networkinformation-nm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
