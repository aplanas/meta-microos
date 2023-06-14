SUMMARY = "Tox client"
DESCRIPTION = "Powerful Tox client that tries to follow the Tox UI mockup while running on all \
major systems."
LICENSE = "GPL-3.0-only"

PV = "1.17.6"

RPM_NAME = "qtox-1.17.6-1.9.aarch64.rpm"
RPM_HASH = "8341998cb7d4b1eb17160cee6800fe4578c391809dc1aa124ef9b83ef5f48a8020b6236a80da9b2715fee3765ce1cb9df05cd6411ba3b2fa6543a5aade893ad3"

RPROVIDES:${PN} += "qtox"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5SonnetUi.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXss.so.1 \
libavcodec.so.60 \
libavdevice.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libexif.so.12 \
libm.so.6 \
libopenal.so.1 \
libqrencode.so.4 \
libsnore-qt5.so.0.7 \
libsodium.so.23 \
libsqlcipher-3.41.2.so.0 \
libstdc++.so.6 \
libswscale.so.7 \
libtoxcore.so.2"

inherit rpm
