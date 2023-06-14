SUMMARY = "Icculus SDL port of the Rise of the Triad engine"
DESCRIPTION = "The package contains an SDL port of the engine used for the \
first-person 3D action game 'Rise of the Triad'. \
 \
The ROTT engine is a derivative of the Wolfenstein 3D one, inheriting \
level design limits like orthogonal walls and flat floor and ceiling \
heights throughout a map. However, the engine did pioneer panoramic \
skies, simulated dynamic lighting, fog, bullet holes, breakable glass \
walls, and synthetic level-over-level environments through use of \
individual collision objects."
LICENSE = "GPL-2.0+"

PV = "1.1.2+svn287"

RPM_NAME = "rott-1.1.2+svn287-1.27.aarch64.rpm"
RPM_HASH = "fc1ac961e3cb6acd179ba9d917fddd0b1a0af626689e11af653512671d565f633b0f2e1f87bb9bc5ae31d8db5f2ad353a93fe51e38df71fecafb5584594c4257"

RPROVIDES:${PN} += "rott"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6"

inherit rpm
