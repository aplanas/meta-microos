SUMMARY = "Qmlglsink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the qmlglsink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-qtqml-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "c866a91dbbbc2c0b894e8e24823c2923afb0ce11628286271883efa5f4da93df32ec14fec472fea5aa0af20045eab6e41d6213e51de26ba6e0757e5914fb5afe"

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
