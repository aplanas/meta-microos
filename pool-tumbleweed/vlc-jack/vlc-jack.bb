SUMMARY = "Jack integration for the VLC media player"
DESCRIPTION = "This package adds jack support to vlc via plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-jack-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "4f83b3983da4dbd0df7eafacd797ac7a2bb946822045fe52e47f20c77e1252fbc752cca9127eb2912a988d3236fdebd784aa678c6314510ce228dc07b6c995f6"

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
