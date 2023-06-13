SUMMARY = "Program to turn a mobile device into a webcam"
DESCRIPTION = "This program turns a mobile device into a webcam. \
 \
It can be used with chat programs like Skype, Zoom, Teams, or with \
live streaming programs like OBS."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "droidcam-1.9.0-1.2.aarch64.rpm"
RPM_HASH = "f33d8c03aa2352811dc0c1155acd90c6ac4a5c173084787534c8f61fd22e37ee401e457b922fe83b83845b08ea6077878aa42cb0bbf77476a34ff88803044063"

RPROVIDES:${PN} += "application() \
application(droidcam.desktop) \
droidcam \
droidcam(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
kmod(v4l2loopback.ko) \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libappindicator3.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libspeex.so.1()(64bit) \
libswscale.so.7()(64bit) \
libturbojpeg.so.0()(64bit) \
libusbmuxd-2.0.so.6()(64bit)"

inherit rpm
