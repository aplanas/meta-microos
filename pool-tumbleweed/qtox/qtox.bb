SUMMARY = "Tox client"
DESCRIPTION = "Powerful Tox client that tries to follow the Tox UI mockup while running on all \
major systems."
LICENSE = "GPL-3.0-only"

PV = "1.17.6"

RPM_NAME = "qtox-1.17.6-1.9.aarch64.rpm"
RPM_HASH = "8341998cb7d4b1eb17160cee6800fe4578c391809dc1aa124ef9b83ef5f48a8020b6236a80da9b2715fee3765ce1cb9df05cd6411ba3b2fa6543a5aade893ad3"

RPROVIDES:${PN} += "application() \
application(qtox.desktop) \
metainfo() \
metainfo(io.github.qtox.qTox.appdata.xml) \
mimehandler(application/x-tox) \
mimehandler(x-scheme-handler/tox) \
qtox \
qtox(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavdevice.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libexif.so.12()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libqrencode.so.4()(64bit) \
libsnore-qt5.so.0.7()(64bit) \
libsodium.so.23()(64bit) \
libsqlcipher-3.41.2.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit) \
libtoxcore.so.2()(64bit)"

inherit rpm
