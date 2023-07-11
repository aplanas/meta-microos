SUMMARY = "Same Game for GNOME"
DESCRIPTION = "Swell Foop is a puzzle game, of which the objective is to clear the \
window of as many pieces as possible by clicking on groups of the same \
colored pieces. That group will vanish and the pieces on top will fall \
until there are none left or no more color groups."
LICENSE = "GPL-2.0-or-later"

PV = "41.1"

RPM_NAME = "swell-foop-41.1-1.7.aarch64.rpm"
RPM_HASH = "e4175b4077e48b0040afb29258e66cdc907b48e11e57f3fc92196d356ff8141979ed07a34860895965c4f96a2c6727638e66a89eb4227b2af88bc8e806b01dcb"

RPROVIDES:${PN} += "swell-foop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
