SUMMARY = "Image grabber for v4l devices"
DESCRIPTION = "vgrabbj is used to grab single images from a video4linux device (e.g. webcam) \
and store it in a file (jpg/png)."
LICENSE = "GPL-2.0+"

PV = "0.9.9"

RPM_NAME = "vgrabbj-0.9.9-1.10.aarch64.rpm"
RPM_HASH = "de4e8ba98772404a5a4a9a61051c90c0c35bc20697be708a5ec084a1d4d67aaf2e5d3db330dc402bdc288ae038907b0a5796666187bc633d74ed02715b549f5b"

RPROVIDES:${PN} += "config-vgrabbj \
vgrabbj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libv4l1.so.0"

inherit rpm
