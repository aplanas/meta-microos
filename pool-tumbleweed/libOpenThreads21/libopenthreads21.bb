SUMMARY = "Shared libraries for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the shared libraries for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenThreads21-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "577b7e24ca4724b880b93e9d4cc610f9dde40e352227d654623887dbaaa7de200f7c2a4e13d7573fc9d5f4ea995f74c4fe74e651c0c54ae2c685522f7adddd9a"

RPROVIDES:${PN} += "libOpenThreads.so.21 \
libOpenThreads21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
