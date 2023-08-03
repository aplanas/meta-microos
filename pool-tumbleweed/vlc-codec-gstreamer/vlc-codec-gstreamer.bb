SUMMARY = "GStreamer integration for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
using GStreamer and its submodules as a backend to decode streams."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-codec-gstreamer-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "fa0aa371aa4631e999081c6cec4e8a7d9a89dbf2d9c742ad3c5ca2b9173ce78804e58c6120da73744ef286188e1fce437050661ea9aa2437c7bf37e2324478f2"

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
