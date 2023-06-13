SUMMARY = "Tools for multimedia access"
DESCRIPTION = "Various tools providing access to multimedia metadata and similar things. \
 \
This build of libav-tools is modified to use the ffmpeg libraries"
LICENSE = "GPL-2.0+"

PV = "12.3"

RPM_NAME = "libav-tools-12.3-1.24.aarch64.rpm"
RPM_HASH = "89d2888761e01406703b194c546685df2d2040fc2301eccdb38cd70116adefc0591ab9ba7e4fd2eb5b97b43e4271c34809d6b8e6b3b5beee854d3eb4f2929314"

RPROVIDES:${PN} += "libav-tools \
libav-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavresample.so.4.0()(64bit) \
libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit)"

inherit rpm
