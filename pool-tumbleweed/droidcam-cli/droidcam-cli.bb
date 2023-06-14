SUMMARY = "Command line client for droidcam"
DESCRIPTION = "This program turns a mobile device into a webcam. \
 \
It can be used with chat programs like Skype, Zoom, Teams, or with \
live streaming programs like OBS."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "droidcam-cli-1.9.0-1.2.aarch64.rpm"
RPM_HASH = "d4d1acccca551ca8e7ab08602c629ce42d5aef0c67eaeacba1fce8c95d46ba97bc79bd9da1eb3219e7d157d889d3ab6c74448413c31ab0cb0aa494efca05f7cf"

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
