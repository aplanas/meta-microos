SUMMARY = "Ogre Volume component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains a component to render volumes. It can handle any volume \
data, but featurewise has a tedency towards terrains. The terrain aspect means \
that it is all about huge meshes being displayed with a level of detail \
mechanism. Thanks to volume rendering, caves, cliffes, holes and similar \
geometry can be displayed. \
 \
* Volume Rendering via Dual Marching Cubes. \
* LOD mechanism via a chunk tree and marching squares skirts for crack \
  patching. \
* Data Sources: 3D Textures with density values and the ability to buildup a \
  CSG Tree with 3D Textures, Spheres, Cubes, Planes, Intersection, Union, \
  Difference and Negation, SimplexNoise addition. \
* An own compressible file format for discrete density values."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreVolume13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "7e1cc90d74bf45d5dc9cfb7d9f624cebe605b2273884d2575370edd201caff0926281f618e1bff3beb2634388f0c93416afef888f58c0218e3cbfa11fc32e4c6"

RPROVIDES:${PN} += "libOgreVolume.so.13.5 \
libOgreVolume13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
