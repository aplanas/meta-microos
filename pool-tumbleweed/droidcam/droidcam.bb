SUMMARY = "Program to turn a mobile device into a webcam"
DESCRIPTION = "This program turns a mobile device into a webcam. \
 \
It can be used with chat programs like Skype, Zoom, Teams, or with \
live streaming programs like OBS."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "droidcam-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "d5d2a3381ec425333d0bd47d6b15bc3d1b8d77ac84696c0f2732c3913e7a7042a302aec4a92467e72ab60d73a8ba142fda5c34028eb861234ec99552da32ea28"

RPROVIDES:${PN} += "droidcam"

RDEPENDS:${PN} += "hicolor-icon-theme \
kmod-v4l2loopback.ko \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libappindicator3.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libspeex.so.1 \
libswscale.so.7 \
libturbojpeg.so.0 \
libusbmuxd-2.0.so.6"

inherit rpm
