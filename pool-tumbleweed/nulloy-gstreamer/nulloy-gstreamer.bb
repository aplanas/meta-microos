SUMMARY = "Gstreamer plugin for nulloy"
DESCRIPTION = "This package contains the gstreamer playback plugin for nulloy - a lightweight \
music player with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-gstreamer-0.9.5-1.11.aarch64.rpm"
RPM_HASH = "7f02b71a0c17f859798084e40231c6aa18151c60cf4fd5ac19aaecdeb221e4eba4c4531879c259e4ea4efb7dd885efe6d09e4edc2b0f9cc9df0de586800001a3"

RPROVIDES:${PN} += "libplugin-gstreamer.so \
nulloy-gstreamer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libstdc++.so.6 \
nulloy"

inherit rpm
