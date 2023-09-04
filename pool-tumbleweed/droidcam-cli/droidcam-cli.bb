SUMMARY = "Command line client for droidcam"
DESCRIPTION = "This program turns a mobile device into a webcam. \
 \
It can be used with chat programs like Skype, Zoom, Teams, or with \
live streaming programs like OBS."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "droidcam-cli-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "1368ea24e6b095854bd40af726a113ef17ae22a8a64747b198c48f7cdfc14358e717d89d687f875a0526fd6003eefdc342853c891cf71f77510786485f344c47"

RPROVIDES:${PN} += "droidcam-cli"

RDEPENDS:${PN} += "kmod-v4l2loopback.ko \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libspeex.so.1 \
libswscale.so.7 \
libturbojpeg.so.0 \
libusbmuxd-2.0.so.6"

inherit rpm
