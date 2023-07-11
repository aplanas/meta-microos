SUMMARY = "A media player with UI using libmpv"
DESCRIPTION = "Baka MPlayer is a libmpv-based multimedia player. It supports gesture \
seeking, desktop dimming, hardware accelerated playback (vdpau, \
vaapi, vda) and Youtube playback support (and others)."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "baka-mplayer-2.0.4-5.9.aarch64.rpm"
RPM_HASH = "ea45fb84983fee91e23c2488feee15c9d86766853da50ffa00ccb21f6378e0d5258c9ec07fbd5544f2107628c5e8c1090c26a1ac101d85964c342a7677948fa0"

RPROVIDES:${PN} += "baka-mplayer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
