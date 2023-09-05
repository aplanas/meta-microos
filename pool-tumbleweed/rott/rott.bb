SUMMARY = "SDL port of the Rise of the Triad engine"
DESCRIPTION = "The package contains an SDL port of the engine used for the \
first-person 3D action game 'Rise of the Triad'. \
 \
The ROTT engine is a derivative of the Wolfenstein 3D one, inheriting \
level design limits like orthogonal walls and flat floor and ceiling \
heights throughout a map. However, the engine did pioneer panoramic \
skies, simulated dynamic lighting, fog, bullet holes, breakable glass \
walls, and synthetic level-over-level environments through use of \
individual collision objects."
LICENSE = "GPL-2.0-or-later"

PV = "1.2~git107"

RPM_NAME = "rott-1.2~git107-1.1.aarch64.rpm"
RPM_HASH = "8ee20667ae899858c645806a2ae04d1888d53016085dc84cf14a41d7e2b38e68a0625efe926d23471accc0f5316e4226c0cf105502eed58bcd08df049d847583"

RPROVIDES:${PN} += "rott"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6"

inherit rpm
