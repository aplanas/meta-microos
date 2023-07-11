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

RPM_NAME = "smplayer-22.7.0-1.6.aarch64.rpm"
RPM_HASH = "fdf7c95e513d695a59e9e510e2a1922d8db7da11d0885bbb76bd21995b48eb77974a8e3ef109544ea57efae7a77464e7de563de163bd12b7942475c6815b7c91"

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
