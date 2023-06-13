SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "libgviewencoder-2_1-2-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "4440f409ccb3da2aaa16011cbb021bc226788d38a69de7e858ed2f11929c79d6974ec3ccadd1ee63ee973a46a7d98274fba7a2ae4cee05a84cbcf50c45deed03"

RPROVIDES:${PN} += "libgviewencoder-2.1.so.2()(64bit) \
libgviewencoder-2_1-2 \
libgviewencoder-2_1-2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
