SUMMARY = "Classic Breakout-Style Game"
DESCRIPTION = "LBreakoutHD is a scaleable 16:9 remake of LBreakout2, a Breakout-style \
arcade game for Linux featuring a number of added graphical enhancements \
and effects. You control a paddle at the bottom of the playing field \
and must destroy bricks at the top by bouncing balls against them."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "lbreakouthd-1.1.3-1.1.aarch64.rpm"
RPM_HASH = "b2bad558a1f94f61b04de5fafaba8e20ec742976803292549850acde7d6e49a8b64ded65d796b8fc7821355d290f6bda6628cfa5494cc4fcda7430f94eee459d"

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
