SUMMARY = "Old-school Arcade-style Tile-based Bomb-dropping Deathmatch Game"
DESCRIPTION = "3omns is an old-school arcade-style tile-based bomb-dropping deathmatch game."
LICENSE = "GPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "3omns-0.2-3.10.aarch64.rpm"
RPM_HASH = "40451f6670bb188708756a722eb291e85af7a0457893daa2cdf5a87c377eb3355625a046e5d71a36f22a13ae16376e141055bb1355bd3440637c9de3d8bccfe2"

RPROVIDES:${PN} += "3omns"

RDEPENDS:${PN} += "bitstream-vera-fonts \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
liblua5.3.so.5"

inherit rpm
