SUMMARY = "VLC plugin for nulloy"
DESCRIPTION = "This package contains the vlc playback plugin for nulloy - a lightweight \
music player with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-vlc-0.9.5-1.11.aarch64.rpm"
RPM_HASH = "df06840b3bb3a559d822fe6e464bcfc46b0fa623f2114e66e663b0b2cf043f3503c79c0407d3741693f71fa6322a3424bd29463cce2a130922735b34fcb1a333"

RPROVIDES:${PN} += "libplugin-vlc.so \
nulloy-vlc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvlc.so.5 \
nulloy"

inherit rpm
