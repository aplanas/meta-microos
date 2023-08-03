SUMMARY = "Qt 6 Multimedia libraries"
DESCRIPTION = "Qt Multimedia is a module that provides a set of QML types and C++ \
classes to handle multimedia content. It also provides APIs to access \
the camera and radio functionality."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d85a2aa0e6b1a83f9cd1a2537629233e53413f85176e0ba67a85e23cf934dae3067536e906209a4168c9a0fbbd3684a6bf38a3bbe9f92b50729fec71abdedfb4"

RPROVIDES:${PN} += "libffmpegmediaplugin.so \
libgstreamermediaplugin.so \
qt6-multimedia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstphotography-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libva.so.2"

inherit rpm
