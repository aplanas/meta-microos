SUMMARY = "A different take on the music player"
DESCRIPTION = "Musique is a music player designed by and for people that love \
music. Musique does its best to stay out the way and keep you \
focused on the only thing that really matters: Music. \
You need to try it to really get it. \
To set expectations right — Musique is not about podcasts or \
internet radio; it's not about managing mobile devices and it has \
no integrated music store. \
It's about listening to beautiful music."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "1.10.1"

RPM_NAME = "musique-1.10.1-1.18.aarch64.rpm"
RPM_HASH = "20aca3e1632c0bd4de369bcc845d972eab765efad7895aedcf3b0000a27bdcfd11c706b7b1a3f5d6987dbd04ea477dd873dc08653067ec04da4e34a08e280199"

RPROVIDES:${PN} += "musique"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libmpv.so.2 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
