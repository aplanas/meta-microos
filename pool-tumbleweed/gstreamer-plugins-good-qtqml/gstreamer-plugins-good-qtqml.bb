SUMMARY = "Qmlglsink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the qmlglsink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-qtqml-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "df59c625b97b7168453ab944a9a80bef771e9fea66fea3797c0c2f6102fd1bd1210cd718c9a2eac1ed2d35e451d162b93d92c8e2ac96f4df0af6b5bae8407c0a"

RPROVIDES:${PN} += "gstreamer-plugins-good-qtqml \
gstreamer1 \
libgstqmlgl.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WaylandClient.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
