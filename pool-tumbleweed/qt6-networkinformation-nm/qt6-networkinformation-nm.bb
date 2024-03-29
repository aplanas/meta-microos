SUMMARY = "Network information for QNetworkInformation"
DESCRIPTION = "Plugin used to get network information such as the reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-networkinformation-nm-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2457a11fbb9cc01e197674d74dc2165a9b0a3d504030f9e804bd06605f327cf0dba1cc52a209d362ce9444334878a92905877ab81e4cc5291b66ac93bfd5c545"

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
