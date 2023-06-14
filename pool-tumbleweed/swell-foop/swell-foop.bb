SUMMARY = "Same Game for GNOME"
DESCRIPTION = "Swell Foop is a puzzle game, of which the objective is to clear the \
window of as many pieces as possible by clicking on groups of the same \
colored pieces. That group will vanish and the pieces on top will fall \
until there are none left or no more color groups."
LICENSE = "GPL-2.0-or-later"

PV = "41.1"

RPM_NAME = "swell-foop-41.1-1.6.aarch64.rpm"
RPM_HASH = "4060b38248e86813c58a7145dbf0767647d63825002fe2df2e1e15ca0e2d3b8ef5d099eae00e9a712ea397776cd269b96b2d6ec27a86f080fad1877ef4ca1e15"

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
