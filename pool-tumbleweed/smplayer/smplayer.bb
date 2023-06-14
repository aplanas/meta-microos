SUMMARY = "Complete frontend for MPV"
DESCRIPTION = "SMPlayer is a front-end for MPV/MPlayer, from basic features like \
playing videos, DVDs, and VCDs to more advanced features like support \
for MPV filters and more. \
 \
SMPlayer remembers the settings of all files you play. Opening a \
movie again will resume at the same point it was left, and with the \
same chosen audio track, subtitles and volume level."
LICENSE = "GPL-2.0-or-later"

PV = "22.7.0"

RPM_NAME = "smplayer-22.7.0-1.5.aarch64.rpm"
RPM_HASH = "98b563faa91876bde3890d265b2dd7f3f578a6b985e24d591ed842655798058cfabae2b29177942ab28af878b6db256d7f5f6172dde7bf5dd43c0c17a8b958ee"

RPROVIDES:${PN} += "smplayer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
mpv"

inherit rpm
