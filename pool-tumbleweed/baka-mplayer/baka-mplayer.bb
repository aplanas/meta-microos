SUMMARY = "A media player with UI using libmpv"
DESCRIPTION = "Baka MPlayer is a libmpv-based multimedia player. It supports gesture \
seeking, desktop dimming, hardware accelerated playback (vdpau, \
vaapi, vda) and Youtube playback support (and others)."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "baka-mplayer-2.0.4-5.8.aarch64.rpm"
RPM_HASH = "8a5b1d6abe32d49c8c27f784cccffe224fe53d6e297a9b7af03609f5cd5e17adce82fd2372e9b8b838f8e78cf77339fc2181aa01e1466fd3a7d7a11eeee20918"

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
