SUMMARY = "Tetravex Game for GNOME"
DESCRIPTION = "Tetravex is a simple puzzle game in which pieces have numbers on each \
side. The pieces must be positioned so that the same numbers touch \
each other, during which you are being timed. The times are then \
stored in a system-wide scoreboard."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-tetravex-3.38.2-2.7.aarch64.rpm"
RPM_HASH = "8f17c08d17f929305085be2221ba43d6162860424376a5c9ba29117b7a48f3846386c929d0876c5ba6a77d456a5de1cd5c0065a86da03cb58c718be037a0021f"

RPROVIDES:${PN} += "gnome-tetravex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
