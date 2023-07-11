SUMMARY = "OpenCV plugins for VLC media player"
DESCRIPTION = "This subpackage provides a wrapper plugin for OpenCV for \
OpenCV based video filters and a face detection example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-opencv-3.0.18-7.3.aarch64.rpm"
RPM_HASH = "c26317428099a8c69847a64a581cfaee8922da4442dab8c475c919145c1549739ca9ec5a523e4dc03dce701e5a610e973fd0cfe036f74eabee8a3ee1f92f4469"

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
