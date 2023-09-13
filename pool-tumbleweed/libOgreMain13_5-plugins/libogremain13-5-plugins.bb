SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-plugins-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "fa19a6b1c192f48f359b7c9d744bc837dda482b52154e260ff2ff979ab19e7fda24044355b9a816d7df236c6f81d4bd54a9a6f825b912add1b5689217d0885f1"

RPROVIDES:${PN} += "libOgreMain-plugins \
libOgreMain13-5-plugins"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libOgreMain.so.13.5 \
libOgreTerrain.so.13.5 \
libSPIRV.so.13 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.13 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
