SUMMARY = "Tools for multimedia access"
DESCRIPTION = "Various tools providing access to multimedia metadata and similar things. \
 \
This build of libav-tools is modified to use the ffmpeg libraries"
LICENSE = "GPL-2.0+"

PV = "12.3"

RPM_NAME = "libav-tools-12.3-1.26.aarch64.rpm"
RPM_HASH = "85f2cf64c251737cf6c9670b5d47ea0455c8701f2204c061c9c84238aba3605d1dae92ba69889493b4e7d549e1ff9715dec45d34e49d8048b290b87d4077c5ea"

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
