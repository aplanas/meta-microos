SUMMARY = "Klotski Game for GNOME"
DESCRIPTION = "Klotski is a puzzle game of which the objective is to get the \
patterned block to the marker, which is done by moving the blocks in \
its way."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-klotski-3.38.2-1.14.aarch64.rpm"
RPM_HASH = "85750ade73b8c9b9b375b421275ef86103d412377e28e5b4f2d5e19de24ff84e2dd25f595b360526a73ef07a6d139dca5e7917ebfb77cc3334639f712693e422"

RPROVIDES:${PN} += "gnome-klotski"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
librsvg-2.so.2"

inherit rpm
