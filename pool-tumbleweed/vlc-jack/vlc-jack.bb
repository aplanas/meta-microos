SUMMARY = "Jack integration for the VLC media player"
DESCRIPTION = "This package adds jack support to vlc via plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-jack-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "f8d0ca332603c3b600cfcd550bbc82454b4376a5094cd900927b0561f4b02506d8b50fd87c5d4087b5ec3031662c1a35c25a9d7c24a6791dddac1e2a5010e8ab"

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
