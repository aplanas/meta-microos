SUMMARY = "Audio File Encoder"
DESCRIPTION = "Flacon extracts individual tracks from one big audio file containing the entire \
album of music and saves them as separate audio files. To do this, it uses \
information from the appropriate CUE file. Besides, Flacon makes it possible \
to conveniently revise or specify tags both for all tracks at once or for each \
tag separately."
LICENSE = "LGPL-2.1-or-later"

PV = "11.1.0"

RPM_NAME = "flacon-11.1.0-1.1.aarch64.rpm"
RPM_HASH = "5fe1cf5cdd0ba4751b6b6fc983256f968173a64f8ce241f25a92f4c248cee47844b3fd5f3f4e1aaa8377f052d6eb8d8419d0a092ece4643d18a6b73f6dff1179"

RPROVIDES:${PN} += "flacon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.1 \
libuchardet.so.0"

inherit rpm
