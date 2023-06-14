SUMMARY = "OpenCV plugins for VLC media player"
DESCRIPTION = "This subpackage provides a wrapper plugin for OpenCV for \
OpenCV based video filters and a face detection example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-opencv-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "69db56c8b4392ff52fe784bbd0b2b51f0725050af47b6e381c4c9c55f7a2d52601a3b6ccc190bb71bff32c546f4d85420da517d331a4b269ff4f911df040e5f4"

RPROVIDES:${PN} += "libopencv-example-plugin.so \
libopencv-wrapper-plugin.so \
vlc-/usr/lib64/vlc/plugins/video-filter/libopencv-example-plugin.so \
vlc-opencv"

RDEPENDS:${PN} += "/bin/sh \
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
