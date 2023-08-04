SUMMARY = "wlr-layer-shell integration for Qt 5"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "layer-shell-qt5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "60ec3ca41ea22c3b428ac845a1669bc7c8f0a31ba6b4e8f585f3d92535d31d7ac9cde3505f2da917435df878f174735912664578cb0adf3dad93d746c15907e1"

RPROVIDES:${PN} += "layer-shell-qt5 \
libLayerShellQtInterface.so.5 \
liblayer-shell.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
