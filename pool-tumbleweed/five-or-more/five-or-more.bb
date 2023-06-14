SUMMARY = "'Five or More' Game for GNOME"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package provides the binary, manual and data files for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "3.32.3"

RPM_NAME = "five-or-more-3.32.3-1.7.aarch64.rpm"
RPM_HASH = "b46c519389eb1c922a229efe7f4c932c24bda5c668ed6b734ec4c6ae45297fd9a669a572f20d983c067bf8c18f4ca808b69f38c793a4795202b710b646309e87"

RPROVIDES:${PN} += "five-or-more"

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
libm.so.6 \
librsvg-2.so.2"

inherit rpm
