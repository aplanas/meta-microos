SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavjpeg-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "d26e335ac927c0896b8642e5fadee8c3d3b9ddcb4a3461364f19396dfc796a9dc669812fe1b624bdf8b8e3a6bfff988d1fa06971bc682015bc6b38594b7c0f2a"

RPROVIDES:${PN} += "liblavjpeg-2-2-0 \
liblavjpeg-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libmjpegutils-2.2.so.0"

inherit rpm
