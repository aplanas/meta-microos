SUMMARY = "UPnP and OpenHome audio Control Point"
DESCRIPTION = "upplay is a Qt5-based audio Control Point for browsing and playing music \
managed by your UPnP/DLNA media servers to your UPnP/DLNA/OpenHome players (renderers)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "upplay-1.6.3-1.5.aarch64.rpm"
RPM_HASH = "1a28350b0798eb7267ae525ba2f718d4ad263ace5e43ac52b72d5de0166d972b5a9e233512641992e77a1247a2c7ab53912ccfa5dda8f44f6e815bf397630e16"

RPROVIDES:${PN} += "upplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libmpris-qt5.so.1 \
libstdc++.so.6 \
libupnpp.so.12"

inherit rpm
