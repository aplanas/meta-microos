SUMMARY = "Network information for QNetworkInformation"
DESCRIPTION = "Plugin used to get network information such as the reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-networkinformation-nm-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "accd6f1d23366fa1d69d18a007102e8ea3802b41e8be6e63f1c09459e9f410adefeaeb1d8dccf6ab65bfabbee1b966e651ab00935f7c7038ab374f857d2593d0"

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
