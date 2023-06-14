SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavjpeg-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "38cd9f2ac5fc86b7a1a9a704e496c36749d6d76072ad6e9f9758a58fb7ac3f798ff503e98e2714ee69de93c298880c5b421049b481ba76d6d1904eb60393eec0"

RPROVIDES:${PN} += "liblavjpeg-2-2-0 \
liblavjpeg-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libmjpegutils-2.2.so.0"

inherit rpm
