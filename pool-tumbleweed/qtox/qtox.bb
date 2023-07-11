SUMMARY = "Tox client"
DESCRIPTION = "Powerful Tox client that tries to follow the Tox UI mockup while running on all \
major systems."
LICENSE = "GPL-3.0-only"

PV = "1.17.6"

RPM_NAME = "qtox-1.17.6-1.10.aarch64.rpm"
RPM_HASH = "cd43409d19995da2c84acc104bb09ffaf5be2959590454848b6cc319863a1d0a7ce107ece8355fdd401c0d368a6b7b88125e2c27c5eb39c6407eea1cc706c94a"

RPROVIDES:${PN} += "qtox"

RDEPENDS:${PN} += "/usr/bin/sh \
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
