SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavfile-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "d04c32fbc514c45cd03755164e8b4cd6c540f7e28037e3750f6755730e5a6c52bd7caa49d910017118dcbefe4ca45235e358ba037ad6f97469d13a675a4ae413"

RPROVIDES:${PN} += "liblavfile-2-2-0 \
liblavfile-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libmjpegutils-2.2.so.0 \
libquicktime.so.0"

inherit rpm
