SUMMARY = "OpenCV video sources and filters plugins"
DESCRIPTION = "These plugins may cause slow exports due to multiprocessing issues \
in kdenlive and shotcut. plugins facebl0r and facedetect. \
See boo#1068792"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-opencv-1.8.0-2.4.aarch64.rpm"
RPM_HASH = "a46f3d138474290fbc64c1f34d911c5aedb7fb4b2c8b71e51ff67d2805fbccfab9b819adc7d3442569a25e10cc15cb2bee2829095d40f3486234507eb86ecc9a"

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
