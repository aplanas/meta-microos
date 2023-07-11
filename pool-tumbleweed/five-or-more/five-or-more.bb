SUMMARY = "'Five or More' Game for GNOME"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package provides the binary, manual and data files for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "3.32.3"

RPM_NAME = "five-or-more-3.32.3-1.8.aarch64.rpm"
RPM_HASH = "cc5cfdbf34c0ec78bcc4493c9f13299a728efc0abd5846fd542d464fd58a23c4cd3d8c8f7cf9da6184c416fd037e5de652029549491ac2cd1c33b6d8259ac839"

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
