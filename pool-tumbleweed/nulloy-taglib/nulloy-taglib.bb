SUMMARY = "Taglib plugin for nulloy"
DESCRIPTION = "This package contains the taglib plugin for nulloy - a music player \
with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-taglib-0.9.5-1.9.aarch64.rpm"
RPM_HASH = "a5d4fb8401d7012dbc84a7c71d05c0013bee50a88c2e79c0fb8ca01173bbbdb8f83262ca009a18b54a22b86fae1c00386eaf9807a8f11b62632a251e2c21cfe4"

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
