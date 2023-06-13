SUMMARY = "Atomix-like Game of moving Marbles in Puzzle"
DESCRIPTION = "LMarbles is a game similar to Atomix and was heavily inspired by it. \
The goal is to arrange a figure out of single marbles within a time \
limit to reach the next level. \
 \
Your goal in the puzzle game marbles is to create a more or less complex \
figure out of single marbles within a time limit to reach the next \
level. Sounds easy? Well, there is a problem: If a marble starts to \
move, it will not stop until it hits a wall or another marble."
LICENSE = "GPL-2.0"

PV = "1.0.8"

RPM_NAME = "lmarbles-1.0.8-2.23.aarch64.rpm"
RPM_HASH = "5c57fe047103b5c7f5d06169fb3ca5c6d3fa785a474784ec2ad73f05ebb0547aed34fb63d932f9d59ba1a117249ccf80980f92017305091665c3845ca9c74dc2"

RPROVIDES:${PN} += "application() \
application(lmarbles.desktop) \
lmarbles \
lmarbles(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
