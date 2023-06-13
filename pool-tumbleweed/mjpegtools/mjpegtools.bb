SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "mjpegtools-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "50c1cdf181d84abdf226fa097966840c89ca872b1a3cbb8e8c1a4dc1dc0b54af1ebfd3781b210d3b7d8beb257d9d9c79a4f519667b76f1faab8fbc4685bf6a45"

RPROVIDES:${PN} += "mjpegtools \
mjpegtools(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
info \
ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_gfx.so.15()(64bit) \
libc.so.6()(64bit) \
libdv.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
liblavfile-2.2.so.0()(64bit) \
liblavjpeg-2.2.so.0()(64bit) \
liblavplay-2.2.so.0()(64bit) \
liblavrec-2.2.so.0()(64bit) \
libm.so.6()(64bit) \
libmjpegutils-2.2.so.0()(64bit) \
libmpeg2encpp-2.2.so.0()(64bit) \
libmplex2-2.2.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libquicktime.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
