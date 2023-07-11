SUMMARY = "OpenCV video sources and filters plugins"
DESCRIPTION = "These plugins may cause slow exports due to multiprocessing issues \
in kdenlive and shotcut. plugins facebl0r and facedetect. \
See boo#1068792"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-opencv-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "357a166da8eeebd958076b339593e4298834d228c30f42579b25d0a268c766c70ecd85c49bbac78c72bf667322e38a3efc45de326534863f23d8a3ca51ebb940"

RPROVIDES:${PN} += "frei0r-plugins-opencv"

RDEPENDS:${PN} += "frei0r-plugins \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-objdetect.so.407 \
libopencv-video.so.407 \
libstdc++.so.6"

inherit rpm
