SUMMARY = "Qt6 WebEngineCore library"
DESCRIPTION = "The Qt6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineCore6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e27e4bb9dd7409d025217d2ae98c219629b600618bc2bccf133a0ed4ae1113db484d94d38948eb1dea74da2849175c60cd3818749fc59c2051027be7f1816b6d"

RPROVIDES:${PN} += "libQt6WebEngineCore.so.6()(64bit) \
libQt6WebEngineCore.so.6(Qt_6)(64bit) \
libQt6WebEngineCore6 \
libQt6WebEngineCore6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Positioning.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6WebChannel.so.6()(64bit) \
libQt6WebChannel.so.6(Qt_6)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libevent-2.1.so.7()(64bit) \
libexpat.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libharfbuzz-subset.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libminizip.so.1()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libopenjp2.so.7()(64bit) \
libopus.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libre2.so.10()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvpx.so.8()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbfile.so.1()(64bit) \
libz.so.1()(64bit) \
qt6-webengine"

inherit rpm
