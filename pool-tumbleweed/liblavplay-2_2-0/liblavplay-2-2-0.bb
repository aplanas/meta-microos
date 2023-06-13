SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavplay-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "86f9ce57ec1b6af61bfb17ee6dfa9eda3d42f6c62f9ded20505315e3cff853cfedb0b5a8ff53cec1208c80bbb0cde2efbce2999404e67e34d3c0168d585b456c"

RPROVIDES:${PN} += "liblavplay-2.2.so.0()(64bit) \
liblavplay-2_2-0 \
liblavplay-2_2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdv.so.4()(64bit) \
liblavfile-2.2.so.0()(64bit) \
liblavjpeg-2.2.so.0()(64bit) \
libmjpegutils-2.2.so.0()(64bit)"

inherit rpm
