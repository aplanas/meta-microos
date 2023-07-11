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

RPM_NAME = "libOpenThreads21-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "7584b1c90825e5237ee3ee61c0c7329282ea5a6d0e6f052df39b9202b98ea488a1da86c3c54940cb5b57ba53fc202227868b2aa8013dcd3481f729fca456c002"

RPROVIDES:${PN} += "libOpenThreads.so.21 \
libOpenThreads21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
