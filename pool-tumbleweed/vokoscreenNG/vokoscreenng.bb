SUMMARY = "Screencast creator"
DESCRIPTION = "vokoscreenNG is a user friendly Open Source screencaster for Linux and Windows."
LICENSE = "GPL-2.0-only"

PV = "3.7.0"

RPM_NAME = "vokoscreenNG-3.7.0-1.1.aarch64.rpm"
RPM_HASH = "a5f31452465997b357d993365953518460819b9c3a36e36a6966c956770688964b9dc1a46dcd8a1a98c9aff2eec7507ab8dea544e78a21b4e68e491aa7179923"

RPROVIDES:${PN} += "vokoscreen \
vokoscreenNG"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
pulseaudio-daemon"

inherit rpm
