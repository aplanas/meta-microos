SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-plugins-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "36da74332798869f918d1bf5c957ddd47dbd3045185964d986b7db08cc337e8016d5e5bb787e7d31a9f52986ce3e1754567bc8b1b6ea028e6a56ab5427c4a5f0"

RPROVIDES:${PN} += "libOgreMain-plugins \
libOgreMain13-5-plugins"

RDEPENDS:${PN} += "/bin/sh \
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
