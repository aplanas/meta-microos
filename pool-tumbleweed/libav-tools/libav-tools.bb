SUMMARY = "Tools for multimedia access"
DESCRIPTION = "Various tools providing access to multimedia metadata and similar things. \
 \
This build of libav-tools is modified to use the ffmpeg libraries"
LICENSE = "GPL-2.0+"

PV = "12.3"

RPM_NAME = "libav-tools-12.3-1.24.aarch64.rpm"
RPM_HASH = "89d2888761e01406703b194c546685df2d2040fc2301eccdb38cd70116adefc0591ab9ba7e4fd2eb5b97b43e4271c34809d6b8e6b3b5beee854d3eb4f2929314"

RPROVIDES:${PN} += "libav-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavfilter.so.7.110 \
libavformat.so.58.76 \
libavresample.so.4.0 \
libavutil.so.56.70 \
libc.so.6 \
libm.so.6 \
libswscale.so.5.9"

inherit rpm
