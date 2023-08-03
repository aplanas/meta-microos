SUMMARY = "Network information for QNetworkInformation using GNetworkMonitor"
DESCRIPTION = "Plugin using GNetworkMonitor to get network information such as the \
reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-networkinformation-glib-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8ebc3623c7c943a1492716911d67db6742c9ec19438dcaac954f77a7ecea50e3e81c79d9601a572b3dac17e78bf91fc10f33165d0a7a43a8ad68cf1f3bffd276"

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
