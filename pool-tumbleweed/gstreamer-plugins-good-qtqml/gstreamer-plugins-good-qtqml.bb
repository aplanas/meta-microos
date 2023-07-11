SUMMARY = "Qmlglsink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the qmlglsink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-good-qtqml-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "adc1ee6a5bfd89a1f60e8c07fc186e0c95906ecb2b798c5aae091467de0aee5e02441fbb7d933f6907b28565ff08f3f007e61b20d655fef83b34f88a79a74845"

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
