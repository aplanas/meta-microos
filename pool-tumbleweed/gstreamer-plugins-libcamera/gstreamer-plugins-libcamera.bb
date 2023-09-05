SUMMARY = "GStreamer plugins from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
This is its integration plugin for gstreamer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "gstreamer-plugins-libcamera-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "000de9b68195427cc0f9dec1d6ab5802d185803dc8051f96d6d2e6ee24e36a76992a25065dca8b5ee1b2cd6fd24a91131325ee65ac31f431006af87eeb2a7c8b"

RPROVIDES:${PN} += "gstreamer-plugins-libcamera \
gstreamer1 \
libgstlibcamera.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.1 \
libcamera.so.0.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
