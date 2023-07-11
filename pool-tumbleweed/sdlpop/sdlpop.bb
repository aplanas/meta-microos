SUMMARY = "An open-source port of Prince of Persia"
DESCRIPTION = "SDLPoP is an open-source port of Prince of Persia 1, \
that runs natively under Linux. It is based on the DOS \
version of the game, and uses SDL. \
 \
Run the prince executable in a path were the original \
game data files are located."
LICENSE = "GPL-3.0-only"

PV = "1.22"

RPM_NAME = "sdlpop-1.22-1.11.aarch64.rpm"
RPM_HASH = "24721c3f583f2ce601ae922772cb7b420932a5e0986d8461120e7ac4656e82d3183b3f7b3662183761c299392b2ce751bd29add267b45d6647e8053d2e72155b"

RPROVIDES:${PN} += "sdlpop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
