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

RPROVIDES:${PN} += "OpenSceneGraph \
OpenSceneGraph(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenThreads.so.21()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libosg.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgGA.so.161()(64bit) \
libosgPresentation.so.161()(64bit) \
libosgTerrain.so.161()(64bit) \
libosgUtil.so.161()(64bit) \
libosgViewer.so.161()(64bit) \
libosgVolume.so.161()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
