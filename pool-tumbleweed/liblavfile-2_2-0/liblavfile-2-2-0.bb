SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavfile-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "2a9149e2eca258c2edce68677455ce6dccf3fe4f035e84e9c6662460a69d783457d976208aa7d57136a62625b26b676824a1dc2d7a2528f24b55ccfede485db9"

RPROVIDES:${PN} += "liblavfile-2-2-0 \
liblavfile-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libmjpegutils-2.2.so.0 \
libquicktime.so.0"

inherit rpm
