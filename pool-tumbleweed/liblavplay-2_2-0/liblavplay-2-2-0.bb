SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavplay-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "f2e27241659b5dd46ac2464917028b1c5db53d98d576edca73324043ad966497134129b9c0f7af17697f1d72190e48f4dab6268f686b914b351977bdaec315bb"

RPROVIDES:${PN} += "liblavplay-2-2-0 \
liblavplay-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libdv.so.4 \
liblavfile-2.2.so.0 \
liblavjpeg-2.2.so.0 \
libmjpegutils-2.2.so.0"

inherit rpm
