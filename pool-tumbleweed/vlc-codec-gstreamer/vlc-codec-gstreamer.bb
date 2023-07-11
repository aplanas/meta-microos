SUMMARY = "GStreamer integration for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
using GStreamer and its submodules as a backend to decode streams."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-codec-gstreamer-3.0.18-7.3.aarch64.rpm"
RPM_HASH = "3f1e77121559231f5c0e140d470912aaee002667957957f70f3f0aeb9c5036e17519ce924ae5963e0929212f3d29edb7ac73fe2641d701a6fd2621178d84ef88"

RPROVIDES:${PN} += "libgstdecode-plugin.so \
vlc-codec-gstreamer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
