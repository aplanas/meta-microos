SUMMARY = "OpenCV plugins for VLC media player"
DESCRIPTION = "This subpackage provides a wrapper plugin for OpenCV for \
OpenCV based video filters and a face detection example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-opencv-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "884d4f8573d6afbe004bfb885714bb1d96208344efca53ca433bd8a9616eab5acbfa26bf950e76bf0d29f74b2a382a3f003970e32357da1f286ca98314b66a04"

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
