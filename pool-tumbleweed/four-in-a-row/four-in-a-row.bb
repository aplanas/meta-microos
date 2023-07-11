SUMMARY = "Connect Four Game for GNOME"
DESCRIPTION = "The object of Four-in-a-Row is to place four pieces in a vertical, \
horizontal, or diagonal row while the opponent tries to block and make \
his/her own row of four. Four-in-a-Row can be played against another \
human or the computer."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "four-in-a-row-3.38.1-1.15.aarch64.rpm"
RPM_HASH = "e277b11b8e8bfdad653634df5c813d3039a095a4488e3062fbf417dff4fcb27c52361925888c865d2fa8cd349f1e56fa1c9a754e789b7d1f502de4cefc6688bb"

RPROVIDES:${PN} += "four-in-a-row"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0"

inherit rpm
