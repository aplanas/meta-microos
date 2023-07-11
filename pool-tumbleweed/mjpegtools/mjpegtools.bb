SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "mjpegtools-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "2a5d33c73fccecf247bdbcf3b776ef556347c8b01e9a544b8e3a01f9b118c742d6cd6bbc6f6ab84dbfd424d849044151fdb1901af8d922c5165fab932f17b876"

RPROVIDES:${PN} += "mjpegtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.15 \
libc.so.6 \
libdv.so.4 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblavfile-2.2.so.0 \
liblavjpeg-2.2.so.0 \
liblavplay-2.2.so.0 \
liblavrec-2.2.so.0 \
libm.so.6 \
libmjpegutils-2.2.so.0 \
libmpeg2encpp-2.2.so.0 \
libmplex2-2.2.so.0 \
libpng16.so.16 \
libquicktime.so.0 \
libstdc++.so.6"

inherit rpm
