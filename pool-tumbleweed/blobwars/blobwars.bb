SUMMARY = "Mission and Objective based 2D Platform Game"
DESCRIPTION = "Blob Wars : Metal Blob Solid. This is Episode I of the Blob Wars Saga. \
This is a platform game, not unlike those found on the Amiga and SNES. \
The object of the game is to take on the role of solider Blob, Bob, \
and play through the various levels and attempt to rescue as many MIA \
(Missing In Action) Blobs as possible. This is not quite as straight \
forward as it sounds, since the MIAs will often be not directly \
reachable and will require some extra thought. Bob also has to \
contend with environmental hazards, alien invaders and assimilated Blobs."
LICENSE = "GPL-2.0-or-later"

PV = "2.00"

RPM_NAME = "blobwars-2.00-3.1.aarch64.rpm"
RPM_HASH = "e37813620748ba7722d904b8bed89c0dcc5422dc378d45e3f54b37a4d04984c981b9234ae659c69afb606c108cdf2252c3221d78b6067ef7946dc5f922503eea"

RPROVIDES:${PN} += "blobwars"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
