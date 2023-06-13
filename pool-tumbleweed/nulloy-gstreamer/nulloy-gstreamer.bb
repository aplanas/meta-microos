SUMMARY = "Gstreamer plugin for nulloy"
DESCRIPTION = "This package contains the gstreamer playback plugin for nulloy - a lightweight \
music player with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-gstreamer-0.9.5-1.9.aarch64.rpm"
RPM_HASH = "761e3bc5b8f63c6edec3a644383166f9269e5480457c5ac9bf976a08bbe1709679590fd8f1942a86e572eaed1e1144470356772cf84fdf1a5d5ce93e33be06c0"

RPROVIDES:${PN} += "libplugin_gstreamer.so()(64bit) \
nulloy-gstreamer \
nulloy-gstreamer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
nulloy"

inherit rpm
