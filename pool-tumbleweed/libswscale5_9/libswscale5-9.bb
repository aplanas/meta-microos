SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswscale5_9-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "bae8cc8ff9d0249aed04030286667927412a73bd35eb39d8e3d6facea7c653e185267fd33e68f937f14b3846f5288194c7adccc5a05925f971e3b219f0ea2ac4"

RPROVIDES:${PN} += "libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libswscale5_9 \
libswscale5_9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libavutil56_70 \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
