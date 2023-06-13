SUMMARY = "Network information for QNetworkInformation using GNetworkMonitor"
DESCRIPTION = "Plugin using GNetworkMonitor to get network information such as the \
reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-networkinformation-glib-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f5c73895a7a6a91b6bd55dfabd2a7a164653f6c5250945769789a799ef9f033b945bb8cb3f46cdc7ba949e48f9b27f7dc048ff7c50943a588b81629f1bc730c3"

RPROVIDES:${PN} += "libqglib.so()(64bit) \
libqglib.so(Qt_6)(64bit) \
qt6-networkinformation-glib \
qt6-networkinformation-glib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
