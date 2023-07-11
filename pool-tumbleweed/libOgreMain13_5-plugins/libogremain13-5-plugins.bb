SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-plugins-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "0089f85ce5258a4703f5545c88b56d6ea38fc59b686617a14c11f2e8ca7c254ec73d44a3fa94d30287158b9e863750a72cbf3468aa159014b0b11dd57700c629"

RPROVIDES:${PN} += "libOgreMain-plugins \
libOgreMain13-5-plugins"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libOgreMain.so.13.5 \
libOgreTerrain.so.13.5 \
libSPIRV.so.12 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.12 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
