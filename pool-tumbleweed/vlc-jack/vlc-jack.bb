SUMMARY = "Jack integration for the VLC media player"
DESCRIPTION = "This package adds jack support to vlc via plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-jack-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "787a7a752084596b4eba53acdf32f30c703686075891a3d324a0d8ee333c1e17cf31a86026cca45338bd3976c7156e4a4abe054bd22413ec123ad9214e4ab920"

RPROVIDES:${PN} += "libaccess-jack-plugin.so \
libjack-plugin.so \
vlc-jack"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
libm.so.6 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
