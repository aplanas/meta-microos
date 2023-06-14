SUMMARY = "Quake 1 port using Vulkan instead of OpenGL for rendering"
DESCRIPTION = "vkQuake is a Quake 1 port using Vulkan instead of OpenGL for rendering. It is based on the popular QuakeSpasm port and runs all mods compatible with it like Arcane Dimensions or In The Shadows. \
Game data must be placed in ~/.vkquake/id1 ."
LICENSE = "GPL-2.0-or-later"

PV = "1.30.1"

RPM_NAME = "vkquake-1.30.1-1.1.aarch64.rpm"
RPM_HASH = "483d5f61177f1c457be5c9fcd89d7c3005c6e63e518dbdd757b8e649be914ad011ca80042f65bf138a2aa04397c92bd2d16bb7cd8184110384103378b9c5519c"

RPROVIDES:${PN} += "vkquake"

RDEPENDS:${PN} += "libFLAC.so.12 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libmikmod.so.3 \
libopusfile.so.0 \
libvorbisfile.so.3 \
libvulkan.so.1"

inherit rpm
