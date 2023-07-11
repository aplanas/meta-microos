SUMMARY = "Qt 5 Multimedia Library"
DESCRIPTION = "Qt Multimedia is a module that provides a set of QML types and C++ \
classes to handle multimedia content. It also provides APIs to access \
the camera and radio functionality. The included Qt Audio Engine \
provides types for 3D positional audio playback and content \
management."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libQt5Multimedia5-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "80925a147639d35eedd39f996fea69ac16a13d44f392a9c60610945af5a72440a079e9dd799500ec97378eb2de579a81c6e6211c0a91740a8ee7b17f9c20c5ad"

RPROVIDES:${PN} += "libQt5Multimedia.so.5 \
libQt5Multimedia5 \
libQt5MultimediaGstTools.so.5 \
libQt5MultimediaQuick.so.5 \
libQt5MultimediaWidgets.so.5 \
libdeclarative-audioengine.so \
libdeclarative-multimedia.so \
libeglvideonode.so \
libgstaudiodecoder.so \
libgstcamerabin.so \
libgstmediacapture.so \
libgstmediaplayer.so \
libqtaudio-alsa.so \
libqtmedia-pulse.so \
libqtmultimedia-m3u.so \
qt5qmlimport-QtAudioEngine.1 \
qt5qmlimport-QtMultimedia.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstphotography-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libopenal.so.1 \
libpulse.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQuick.2"

inherit rpm
