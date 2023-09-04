SUMMARY = "Network information for QNetworkInformation using GNetworkMonitor"
DESCRIPTION = "Plugin using GNetworkMonitor to get network information such as the \
reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-networkinformation-glib-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "6a030ac975f97842bec6d3c045d1a79e84cde295316ae9f8a51d66f74a54274ee2187fbe644c613d52263212607ff2291e02e34c508dadec457a25ce126d4cca"

RPROVIDES:${PN} += "libqglib.so \
qt6-networkinformation-glib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
