SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavrec-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "b5a0041bca613eb8be31c0640ac3b61105418590b9c2977e6dcf9def9ceafcd112482d7e5a5c6555ca5b7d830c072aa2348146f8025a0fa8cb662ef2d995bf4a"

RPROVIDES:${PN} += "liblavrec-2-2-0 \
liblavrec-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblavfile-2.2.so.0 \
liblavjpeg-2.2.so.0 \
libmjpegutils-2.2.so.0"

inherit rpm
