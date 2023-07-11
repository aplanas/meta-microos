SUMMARY = "Audio File Encoder"
DESCRIPTION = "Flacon extracts individual tracks from one big audio file containing the entire \
album of music and saves them as separate audio files. To do this, it uses \
information from the appropriate CUE file. Besides, Flacon makes it possible \
to conveniently revise or specify tags both for all tracks at once or for each \
tag separately."
LICENSE = "LGPL-2.1-or-later"

PV = "11.2.0"

RPM_NAME = "flacon-11.2.0-1.1.aarch64.rpm"
RPM_HASH = "01ec014497b16c9a4049c06b085a04c244cae4be8ea47c5aff73078508c2002c5763e8e9d91b59fd23d1512e8934cbe3d091f688a4791a433ca5972dd4039a73"

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
