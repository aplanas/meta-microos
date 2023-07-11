SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmplex2-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "e347b7a0b2dbab9ad074a2fb92f9e942abd76df641dd7b7e9800e0c7b0b5083c7f5fe4c20a67e4556f256bbc051ebbc71b1d67fa1150e34de2e1b703b5769cfd"

RPROVIDES:${PN} += "libmplex2-2-2-0 \
libmplex2-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmjpegutils-2.2.so.0 \
libstdc++.so.6"

inherit rpm
