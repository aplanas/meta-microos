SUMMARY = "OpenCV plugins for VLC media player"
DESCRIPTION = "This subpackage provides a wrapper plugin for OpenCV for \
OpenCV based video filters and a face detection example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-opencv-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "1bdbda37aedadaaaca27884958e916ef546e9129594d9f0ac522deb143e764c851971ad4e5f893dcfee385ed3e4df3754b8ba0f988e7b28ed7612bda7a4503a0"

RPROVIDES:${PN} += "libopencv-example-plugin.so \
libopencv-wrapper-plugin.so \
vlc-/usr/lib64/vlc/plugins/video-filter/libopencv-example-plugin.so \
vlc-opencv"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencv-core.so.3.4 \
libopencv-imgproc.so.3.4 \
libopencv-objdetect.so.3.4 \
libstdc++.so.6 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
