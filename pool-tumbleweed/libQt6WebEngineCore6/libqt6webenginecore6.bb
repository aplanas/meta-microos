SUMMARY = "Qt6 WebEngineCore library"
DESCRIPTION = "The Qt6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineCore6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "93d83d37a1073de141672b5292c7b54cc87bd7d2ffda73c50dc043031badd8080adc02e11d79ba47217a98f6c023409513dbbb5d14d7a516ddce78422c470c2c"

RPROVIDES:${PN} += "libQt6WebEngineCore.so.6 \
libQt6WebEngineCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebChannel.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libasound.so.2 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libdbus-1.so.3 \
libevent-2.1.so.7 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopenjp2.so.7 \
libopus.so.0 \
libpng16.so.16 \
libre2.so.10 \
libsnappy.so.1 \
libstdc++.so.6 \
libvpx.so.8 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxkbfile.so.1 \
libz.so.1 \
qt6-webengine"

inherit rpm
