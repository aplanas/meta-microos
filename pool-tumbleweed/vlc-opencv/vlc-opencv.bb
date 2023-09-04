SUMMARY = "OpenCV plugins for VLC media player"
DESCRIPTION = "This subpackage provides a wrapper plugin for OpenCV for \
OpenCV based video filters and a face detection example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-opencv-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "ed5ade5e8f8616437f663c5d4c387527e1e8a672c39e5c9739fdd52263cdc8909473afaa7a810c7a313b5417d5bcb6de42e59b605305a6780c54fc2407dc981a"

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
