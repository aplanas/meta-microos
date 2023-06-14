SUMMARY = "A mplayer like video and audio player with some extra bells and whistles"
DESCRIPTION = "Rage is a simple video and audio player intended to be slick yet simplistic, much like Mplayer. You can provide 1 or \
more files to play on the command-line or just DND files onto the rage window to insert them into the playlist. \
You can get a visual representation of everything on the playlist by hitting the / key, or just hovering your mouse over \
the right side of the window. Mouse back over the left side of the window ti dismiss it or press the key again. \
It has a full complement of key controls if you see the README for the full list. It will automatically search for \
album art for music files, if not already cached, and display that. It even generates thumbnails for the timeline \
of a video and allows you to preview the position on mouseover of the position bar at the bottom of the window."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "rage-0.4.0-1.7.aarch64.rpm"
RPM_HASH = "317482216f4cee142b1287d13cd36159e66cca95b6a0a8b1abb47c2b3913695394f9ed23649cd52541eeab18ce2dcd861df34e69c58a83a964605cdaf61df6eb"

RPROVIDES:${PN} += "rage"

RDEPENDS:${PN} += "efl \
elementary \
evas-generic-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-file.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libefreet.so.1 \
libeina.so.1 \
libeio.so.1 \
libeldbus.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libevas.so.1 \
libm.so.6"

inherit rpm
