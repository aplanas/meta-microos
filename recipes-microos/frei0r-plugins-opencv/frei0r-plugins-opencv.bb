SUMMARY = "OpenCV video sources and filters plugins"
DESCRIPTION = "These plugins may cause slow exports due to multiprocessing issues \
in kdenlive and shotcut. plugins facebl0r and facedetect. \
See boo#1068792"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-opencv-1.8.0-2.4.aarch64.rpm"
RPM_HASH = "a46f3d138474290fbc64c1f34d911c5aedb7fb4b2c8b71e51ff67d2805fbccfab9b819adc7d3442569a25e10cc15cb2bee2829095d40f3486234507eb86ecc9a"

RPROVIDES:${PN} += "frei0r-plugins-opencv \
frei0r-plugins-opencv(aarch-64)"
RDEPENDS:${PN} += "frei0r-plugins \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_objdetect.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
