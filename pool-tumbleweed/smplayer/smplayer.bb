SUMMARY = "Complete frontend for MPV"
DESCRIPTION = "SMPlayer is a front-end for MPV/MPlayer, from basic features like \
playing videos, DVDs, and VCDs to more advanced features like support \
for MPV filters and more. \
 \
SMPlayer remembers the settings of all files you play. Opening a \
movie again will resume at the same point it was left, and with the \
same chosen audio track, subtitles and volume level."
LICENSE = "GPL-2.0-or-later"

PV = "23.6.0"

RPM_NAME = "smplayer-23.6.0-1.1.aarch64.rpm"
RPM_HASH = "43aeed73bf4315d2b66ccee68106ef7aa4b6b460bdd3cbfc6cfe550f84d5f02f4adb7653fa75c1c7bbba99ba2381b6a33cb9e7cd6aed279fb0926b27fc8b864a"

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
