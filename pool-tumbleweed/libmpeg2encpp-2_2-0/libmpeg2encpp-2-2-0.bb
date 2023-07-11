SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmpeg2encpp-2_2-0-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "13b668e53116781d37f997e99619f147f5a3dbfd7d12f07eb4f5a0fd5167bb21e22df736ca8ec1f3a2db233fa6c688ec558402e5d2f6ec25806ea183cf57dd5f"

RPROVIDES:${PN} += "libmpeg2encpp-2-2-0 \
libmpeg2encpp-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmjpegutils-2.2.so.0 \
libstdc++.so.6"

inherit rpm
