SUMMARY = "A VNC server library"
DESCRIPTION = "A VNC server library."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "libneatvnc0-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "0f39a62c11e7ffbe70d19d044d06a5f9c480ad51f3693e5c292f7c707b07e6e3f326b43da841180c46d9d0d0fc6a064432fbd026ffd056d6f85e7d4759502226"

RPROVIDES:${PN} += "libneatvnc.so.0()(64bit) \
libneatvnc0 \
libneatvnc0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaml.so.0()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libpixman-1.so.0()(64bit) \
libturbojpeg.so.0()(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) \
libz.so.1()(64bit)"

inherit rpm
