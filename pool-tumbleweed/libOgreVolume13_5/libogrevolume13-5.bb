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

RPM_NAME = "libOgreVolume13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "03e731e4b49a868a2a832d3106e6543626689764109352bcb8864cb56021ee0085c7709f6042192f91e5e86a74c3636dcfe8462ceca0bfd406fffc74b15fd9f7"

RPROVIDES:${PN} += "libOgreVolume.so.13.5()(64bit) \
libOgreVolume13_5 \
libOgreVolume13_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOgreMain.so.13.5()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
