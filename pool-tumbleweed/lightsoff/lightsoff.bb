SUMMARY = "Lights Out Game for GNOME"
DESCRIPTION = "Lights Out is a board game where the goal is to switch off all tiles. \
Toggling the status of one tile, will also toggle the status of its \
adjacent tiles."
LICENSE = "GPL-2.0-or-later"

PV = "40.0.1"

RPM_NAME = "lightsoff-40.0.1-2.4.aarch64.rpm"
RPM_HASH = "c0abe898eb01a4e571810941fa415ec5f60449d06debbf2cf7ffa791af46643f959485e935847546597c480038744280b364c3034e65e1aad1768bcef3e2b0f3"

RPROVIDES:${PN} += "lightsoff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
