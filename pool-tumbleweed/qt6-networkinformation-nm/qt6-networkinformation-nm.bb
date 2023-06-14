SUMMARY = "Network information for QNetworkInformation"
DESCRIPTION = "Plugin used to get network information such as the reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-networkinformation-nm-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "46c885b0843f29828241edb99c2ab510b3411fa25719fcb437195d39f7dd038913e5b06e721f32cd482cd0ad9e840ac8a69fa42e6c8e1a40fbcb2ab1d1ec3809"

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
