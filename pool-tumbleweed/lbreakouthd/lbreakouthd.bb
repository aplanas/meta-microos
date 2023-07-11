SUMMARY = "Classic Breakout-Style Game"
DESCRIPTION = "LBreakoutHD is a scaleable 16:9 remake of LBreakout2, a Breakout-style \
arcade game for Linux featuring a number of added graphical enhancements \
and effects. You control a paddle at the bottom of the playing field \
and must destroy bricks at the top by bouncing balls against them."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "lbreakouthd-1.1.3-1.2.aarch64.rpm"
RPM_HASH = "e4374445e818d6815980eebee507e59b5520bd2daf6b0fcc4a247c1d8e8c491398374d74c0299d49a6e5dbe5f4c60e4d2a20a4ed72d4ea4625366bb11c0e8daf"

RPROVIDES:${PN} += "lbreakouthd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
user-games"

inherit rpm
