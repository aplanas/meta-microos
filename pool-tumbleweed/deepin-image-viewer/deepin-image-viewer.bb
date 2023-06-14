SUMMARY = "Deepin Image Viewer"
DESCRIPTION = "Deepin Image Viewer is the Image Viewer for Deepin Desktop Environment(DDE)"
LICENSE = "GPL-3.0-or-later"

PV = "5.9.9"

RPM_NAME = "deepin-image-viewer-5.9.9-1.3.aarch64.rpm"
RPM_HASH = "8fb6a7425baf88c615ee09fd0b9f797a71f5d8919e9e7d5635c9e469a3816a8cd027c88f102f5675c3dff5f9efc5ecc4c044a489f0798c4b07e8ac8fe9643f40"

RPROVIDES:${PN} += "deepin-image-viewer \
libxraw.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libimageviewer.so.0.1 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
