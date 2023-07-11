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

PV = "1.2~git66"

RPM_NAME = "rott-1.2~git66-1.1.aarch64.rpm"
RPM_HASH = "8576f21b4ff41509553de4791b2a28dd700a48b841a2ceee1a8f58b1160226337bb24c527bdcefca2edf8166b1397e4eaf93a63f9595c79d6d190d1a382b6246"

RPROVIDES:${PN} += "rott"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
