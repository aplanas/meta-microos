SUMMARY = "Command line client for droidcam"
DESCRIPTION = "This program turns a mobile device into a webcam. \
 \
It can be used with chat programs like Skype, Zoom, Teams, or with \
live streaming programs like OBS."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "droidcam-cli-1.9.0-1.2.aarch64.rpm"
RPM_HASH = "d4d1acccca551ca8e7ab08602c629ce42d5aef0c67eaeacba1fce8c95d46ba97bc79bd9da1eb3219e7d157d889d3ab6c74448413c31ab0cb0aa494efca05f7cf"

RPROVIDES:${PN} += "droidcam-cli \
droidcam-cli(aarch-64)"
RDEPENDS:${PN} += "kmod(v4l2loopback.ko) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libspeex.so.1()(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
libturbojpeg.so.0()(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) \
libturbojpeg.so.0(TURBOJPEG_2.0)(64bit) \
libusbmuxd-2.0.so.6()(64bit)"

inherit rpm
