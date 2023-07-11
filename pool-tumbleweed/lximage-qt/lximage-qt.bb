SUMMARY = "LXQt Image Viewer"
DESCRIPTION = "Image Viewer for LXQt and Thumbnail Generator for PCManFM-Qt"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lximage-qt-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "a8e183fcb29d90954048dbf9dc5acef1d5f18b69b734aef21b5f5abd0eee577caac5b4353d39fa2477b5205c18768362e425da311fa85e838374be3391571cc0"

RPROVIDES:${PN} += "lximage-qt"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libexif.so.12 \
libfm-qt.so.13 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
