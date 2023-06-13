SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-plugins-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "36da74332798869f918d1bf5c957ddd47dbd3045185964d986b7db08cc337e8016d5e5bb787e7d31a9f52986ce3e1754567bc8b1b6ea028e6a56ab5427c4a5f0"

RPROVIDES:${PN} += "libOgreMain-plugins \
libOgreMain13_5-plugins \
libOgreMain13_5-plugins(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libOgreMain.so.13.5()(64bit) \
libOgreTerrain.so.13.5()(64bit) \
libSPIRV.so.12()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglslang.so.12()(64bit) \
libm.so.6()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
