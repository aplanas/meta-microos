SUMMARY = "Minesweeper Game for GNOME"
DESCRIPTION = "This is the popular logic puzzle minesweeper, which includes avoiding \
mines while receiving clues for the location of the mines."
LICENSE = "GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "gnome-mines-40.1-1.8.aarch64.rpm"
RPM_HASH = "dc53164d6457e2deeb725fd0b2ab8dc8173ff89b7152aea8a596e57cdedb08e9175d4c6e2b93d923d0c285b1f5c125942a03ffd3bcdcd7387fb615cb13a40d33"

RPROVIDES:${PN} += "gnome-mines"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
