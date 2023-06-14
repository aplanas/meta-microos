SUMMARY = "Text-Based User Interface for Pidgin Instant Messaging Client"
DESCRIPTION = "A text-based user interface to use with libpurple. This can be run \
from a standard text console or from a graphical terminal emulator. \
It uses ncurses and our homegrown gnt library for drawing windows \
and text."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "finch-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "681827b6093d87431a42ba819a44932000c8f3cb8ff0550b38d1c31ebfb6c78f747d874d268b882f5113eaa6deae2b3f517672dddc537e187ab924c33b3b3396"

RPROVIDES:${PN} += "finch"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgnt.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libncursesw.so.6 \
libpurple \
libpurple.so.0 \
libtinfo.so.6"

inherit rpm
