SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmplex2-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "030fe0f412c6c995a4383228dca5090ab69673e43bfd12295332b7a749c8f97db3994d3e7870dbe70bbe93a70cae0f57b7f5dbc8b8bf91b9b8b824d8dab94461"

RPROVIDES:${PN} += "libmplex2-2-2-0 \
libmplex2-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmjpegutils-2.2.so.0 \
libstdc++.so.6"

inherit rpm
