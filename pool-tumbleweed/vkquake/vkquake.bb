SUMMARY = "Quake 1 port using Vulkan instead of OpenGL for rendering"
DESCRIPTION = "vkQuake is a Quake 1 port using Vulkan instead of OpenGL for rendering. It is based on the popular QuakeSpasm port and runs all mods compatible with it like Arcane Dimensions or In The Shadows. \
Game data must be placed in ~/.vkquake/id1 ."
LICENSE = "GPL-2.0-or-later"

PV = "1.30.1"

RPM_NAME = "vkquake-1.30.1-1.2.aarch64.rpm"
RPM_HASH = "8a45121d352754945933fe8911e7b74bb9dacffa8e0aa09f6a3ac806ff927a85c295d4487328ab2128a62ec98f7448b34854cc8dd3079c4c1d51fc2785cc80dd"

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
