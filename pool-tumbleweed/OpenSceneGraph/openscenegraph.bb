SUMMARY = "3D graphics toolkit"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL, freeing the developer from implementing and optimizing low \
level graphics calls, and provides many additional utilities for \
development of graphics applications."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "6c872de0bcdd2fe742f0fc27279d02744365f276652f599857414db4559c97a5fdd49b655c0789ab3cc717248c47f0dcf1ca6d49edb029552aca8a8ce38fb2fb"

RPROVIDES:${PN} += "OpenSceneGraph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenThreads.so.21 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosg.so.161 \
libosgDB.so.161 \
libosgGA.so.161 \
libosgPresentation.so.161 \
libosgTerrain.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libosgVolume.so.161 \
libstdc++.so.6"

inherit rpm
