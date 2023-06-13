SUMMARY = "Qt 6 Multimedia libraries"
DESCRIPTION = "Qt Multimedia is a module that provides a set of QML types and C++ \
classes to handle multimedia content. It also provides APIs to access \
the camera and radio functionality."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "beb9690a540f6da9405c0228da4b4377b073aff5b33008e9fe47845ddd330bc54a68da3b7c5822c5fa60b3035fd2bbb64f5264d1149d06f9996b564239e9459b"

RPROVIDES:${PN} += "libffmpegmediaplugin.so()(64bit) \
libffmpegmediaplugin.so(Qt_6)(64bit) \
libgstreamermediaplugin.so()(64bit) \
libgstreamermediaplugin.so(Qt_6)(64bit) \
qt6-multimedia \
qt6-multimedia(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Multimedia.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstphotography-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4()(64bit) \
libswscale.so.7()(64bit) \
libva.so.2()(64bit)"

inherit rpm
