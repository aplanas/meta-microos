SUMMARY = "A client for Evol Online and The Mana World: 2D MMORPG"
DESCRIPTION = "ManaPlus is extended client for Evol Online, The Mana World and \
similar servers based on the eAthena fork. As a 2D style game, Evol \
Online creates a fantasy environment. The Mana World (TMW) is an \
effort to create an MMORPG. TMW uses 2D graphics and creates a large \
and diverse interactive world."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.3.17"

RPM_NAME = "manaplus-2.1.3.17-3.2.aarch64.rpm"
RPM_HASH = "8ede20ef30ded934fcd0e57565e79e5cebb4d6fd2d267d5525f38d5207d8b1be1f29b5a8411d9b461dcabcd4f3f7a954f613da986d3097ec896e59710412d9c8"

RPROVIDES:${PN} += "evolonline-client \
manaplus \
manaworld-client"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.15 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-net-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
liberation-fonts \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
