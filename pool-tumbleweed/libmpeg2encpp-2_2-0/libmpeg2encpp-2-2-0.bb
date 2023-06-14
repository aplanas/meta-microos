SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmpeg2encpp-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "abeb63f4b6c3171f44a66221b7d7d4a2aeec86829d3023387feaa830364d11b246107a76331a177379092bc312c27f2b36df3c1c6b2b3fe57847511c44a87de8"

RPROVIDES:${PN} += "libmpeg2encpp-2-2-0 \
libmpeg2encpp-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmjpegutils-2.2.so.0 \
libstdc++.so.6"

inherit rpm
