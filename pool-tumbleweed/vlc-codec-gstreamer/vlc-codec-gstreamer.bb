SUMMARY = "GStreamer integration for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
using GStreamer and its submodules as a backend to decode streams."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-codec-gstreamer-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "6ca7d932c2ffd220d2a67843c024c5c1a59ff4e349e0e2c945479584994c2568fa01416cf5764048e0dd1d14fa15ce4b648b4df5bdd8b13505079bc77654a930"

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
