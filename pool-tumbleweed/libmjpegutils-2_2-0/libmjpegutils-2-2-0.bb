SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmjpegutils-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "19de49e8f4c0dce3caa3720abe6d549ba6ae75ad2ccb67b766a128e71997f1ef164758beb827c2215d52f6c46719c6b640b90908d9d0ebae1729bcdb11f3155f"

RPROVIDES:${PN} += "libmjpegutils-2-2-0 \
libmjpegutils-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
