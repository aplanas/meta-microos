SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "libgviewv4l2core-2_1-2-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "e533bbbde94b023e07ee1a013cec0e8adc951ab403f5c244a5d7f1f2cd536493ed01af03917dc4cdbd3f7839ea312b8373a8f04bb113506f91d127d1c7741cff"

RPROVIDES:${PN} += "libgviewv4l2core-2.1.so.2()(64bit) \
libgviewv4l2core-2_1-2 \
libgviewv4l2core-2_1-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libusb-1.0.so.0()(64bit) \
libv4l2.so.0()(64bit)"

inherit rpm
