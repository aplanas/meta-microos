SUMMARY = "Image grabber for v4l devices"
DESCRIPTION = "vgrabbj is used to grab single images from a video4linux device (e.g. webcam) \
and store it in a file (jpg/png)."
LICENSE = "GPL-2.0+"

PV = "0.9.9"

RPM_NAME = "vgrabbj-0.9.9-1.11.aarch64.rpm"
RPM_HASH = "8c545ad60581eb5cda8e2e846894026642e93124c6f58e9ffe14a08de14b6b4f2353369dbadde8516afa3a9d98a3473c6b7bcd60954f2737affa37ee0d99170d"

RPROVIDES:${PN} += "config-vgrabbj \
vgrabbj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libv4l1.so.0"

inherit rpm
