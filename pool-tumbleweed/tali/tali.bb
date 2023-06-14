SUMMARY = "Yahtzee Game for GNOME"
DESCRIPTION = "Tali is like Yahtzee, or like poker with dice. The player rolls dice \
to try to make the best possible combinations, like 4 of a kind, small \
straight, and full house. The player is allowed 3 rolls per turn and \
can hold certain dice with each roll."
LICENSE = "GPL-2.0-or-later"

PV = "40.9"

RPM_NAME = "tali-40.9-1.3.aarch64.rpm"
RPM_HASH = "ea3897d9f716e71ec74b1b0a7f4b5189b6487c121e0c4afd284608acaa032985a07360bcb23cc2e3498a48fa2622bf60f3fc9352c3d057ba4e756a6b6729c069"

RPROVIDES:${PN} += "tali"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
