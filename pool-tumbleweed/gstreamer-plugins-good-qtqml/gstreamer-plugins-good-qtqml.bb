SUMMARY = "Qmlglsink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the qmlglsink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-qtqml-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "32a13291f7e57f48160358bb7a78f4c9c7aa017765beace7969c2cb6b059ed2dc51fe60d4b38f669a12c94c991be632eb42f8fae4e08e585cfb21c63ece2284d"

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
