SUMMARY = "A client for Evol Online and The Mana World: 2D MMORPG"
DESCRIPTION = "ManaPlus is extended client for Evol Online, The Mana World and \
similar servers based on the eAthena fork. As a 2D style game, Evol \
Online creates a fantasy environment. The Mana World (TMW) is an \
effort to create an MMORPG. TMW uses 2D graphics and creates a large \
and diverse interactive world."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.3.17"

RPM_NAME = "manaplus-2.1.3.17-3.1.aarch64.rpm"
RPM_HASH = "74ee114e32cfe346322044e9a825fb6db336b97dbd97dba1064d2397ca6ed62ed6599fdd71fa1e4206b42ca30d6d97efd7b75ebf3dae75afadbef782bbe9237a"

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
