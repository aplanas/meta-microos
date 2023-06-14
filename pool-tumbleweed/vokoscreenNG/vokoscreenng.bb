SUMMARY = "Screencast creator"
DESCRIPTION = "vokoscreenNG is a user friendly Open Source screencaster for Linux and Windows."
LICENSE = "GPL-2.0-only"

PV = "3.6.0"

RPM_NAME = "vokoscreenNG-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "da3e816e6e30820291a27e32e54e19b0feead2b7faf83945433160b91e28b52c29d26e1f5f4d12a12020edfc58280cee7b47d32483be304441c1309e72264b49"

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
