SUMMARY = "Game based on Sonic the Hedgehog Universe"
DESCRIPTION = "Open Surge is a retro-style 2D sidescroller inspired by old-school \
games. The characters named Surge, Neon and Charge are to save the \
world from the evil Gimacian the Dark."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & CC-BY-3.0 & OFL-1.1 & MIT"

PV = "0.6.0.3"

RPM_NAME = "opensurge-0.6.0.3-2.4.aarch64.rpm"
RPM_HASH = "fcc8dd5191ccf259238d4906a6944596d5f52d812d188fd6e836a559655cea9ae251967665d6fc2c23359692b68bc4b825f2a1818ec7c120162af2c705816f69"

RPROVIDES:${PN} += "opensurge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liballegro-acodec.so.5.2 \
liballegro-audio.so.5.2 \
liballegro-dialog.so.5.2 \
liballegro-font.so.5.2 \
liballegro-image.so.5.2 \
liballegro-memfile.so.5.2 \
liballegro-primitives.so.5.2 \
liballegro-ttf.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libm.so.6 \
libsurgescript.so.0.5.6"

inherit rpm
