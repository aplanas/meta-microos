SUMMARY = "Old-school Arcade-style Tile-based Bomb-dropping Deathmatch Game"
DESCRIPTION = "3omns is an old-school arcade-style tile-based bomb-dropping deathmatch game."
LICENSE = "GPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "3omns-0.2-3.9.aarch64.rpm"
RPM_HASH = "353dc39cdb46ea983349b5c2e47f74557ffe11a389597e4e5ee26bcb4a96492c6b698f5d5a60a1157c05c9ac424568b10c0c17ff7f7e1c90fbfd41ee7834088f"

RPROVIDES:${PN} += "3omns \
3omns(aarch-64) \
application() \
application(3omns.desktop) \
metainfo() \
metainfo(3omns.appdata.xml)"

RDEPENDS:${PN} += "bitstream-vera-fonts \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
liblua5.3.so.5()(64bit)"

inherit rpm
