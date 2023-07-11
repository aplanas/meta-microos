SUMMARY = "Taglib plugin for nulloy"
DESCRIPTION = "This package contains the taglib plugin for nulloy - a music player \
with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-taglib-0.9.5-1.11.aarch64.rpm"
RPM_HASH = "c148403046471a2ddbfe5ce9c8edb7b3512adf813e2b3174fe0109d6dd297c4c7a94c844090924d4291f3b1d40b2a0f1a57f2103d6aeb4f8aacb4d79c00a7ed6"

RPROVIDES:${PN} += "libplugin-taglib.so \
nulloy-taglib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1 \
nulloy"

inherit rpm
