SUMMARY = "Game based on Sonic the Hedgehog Universe"
DESCRIPTION = "Open Surge is a retro-style 2D sidescroller inspired by old-school \
games. The characters named Surge, Neon and Charge are to save the \
world from the evil Gimacian the Dark."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & CC-BY-3.0 & OFL-1.1 & MIT"

PV = "0.6.0.3"

RPM_NAME = "opensurge-0.6.0.3-2.3.aarch64.rpm"
RPM_HASH = "efefd39f7beb2e91d79860f07e267f0ed2db086533c11f12ed572225b4e6bfbcac600bb8176b64377b2db5d29601496dea406ee7a3fd7bb387e841d2001bc060"

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
