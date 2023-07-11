SUMMARY = "Text-Based User Interface for Pidgin Instant Messaging Client"
DESCRIPTION = "A text-based user interface to use with libpurple. This can be run \
from a standard text console or from a graphical terminal emulator. \
It uses ncurses and our homegrown gnt library for drawing windows \
and text."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "finch-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "3b110fdc916508e3c7981843a5fb4ec474116776f51d8ddb556115f98706af874c293775c7c51dd7e115a1f7b29fe6b94d63f61429251f6935861933a34e77b9"

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
