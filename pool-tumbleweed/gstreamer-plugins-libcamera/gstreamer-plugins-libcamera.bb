SUMMARY = "GStreamer plugins from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
This is its integration plugin for gstreamer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "gstreamer-plugins-libcamera-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "48f2300dadaeb67f239f580c7d3a1f6a36bad3aa322604d7adafb0d6bb891d915fde0b50d3aa2e6d99e37fbc1cef944385304830466856b105f7ba039624b293"

RPROVIDES:${PN} += "gstreamer-plugins-libcamera \
gstreamer-plugins-libcamera(aarch-64) \
gstreamer1(element-libcamerasrc)()(64bit) \
libgstlibcamera.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcamera-base.so.0.0.4()(64bit) \
libcamera.so.0.0.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
