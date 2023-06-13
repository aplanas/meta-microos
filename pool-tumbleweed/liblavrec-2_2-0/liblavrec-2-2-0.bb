SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavrec-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "de8e7399d832dd6e27cf8ef8ea5a9b90b14c9f4ea8f4dd2469c06b165e7666708f95a21c92c87a3d349028b2092284855287315f2d060d0cdc7cfafb2b7e8dd9"

RPROVIDES:${PN} += "liblavrec-2.2.so.0()(64bit) \
liblavrec-2_2-0 \
liblavrec-2_2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblavfile-2.2.so.0()(64bit) \
liblavjpeg-2.2.so.0()(64bit) \
libmjpegutils-2.2.so.0()(64bit)"

inherit rpm
