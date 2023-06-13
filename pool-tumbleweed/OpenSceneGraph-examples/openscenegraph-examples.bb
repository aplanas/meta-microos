SUMMARY = "OpenSceneGraph example applications"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains some example applications built with OpenSceneGraph"
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-examples-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "0ff7e2addf0420e9cd31479a15bdf94b14d684d9a4742408c51229f31d6d38f621f59be665ef4db9d70b856d11439fe41cda5682630729e63b15e8f20b44c0fa"

RPROVIDES:${PN} += "OpenSceneGraph-examples \
OpenSceneGraph-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFOX-1.6.so.0()(64bit) \
libGL.so.1()(64bit) \
libOpenThreads.so.21()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfltk.so.1.3()(64bit) \
libfltk_gl.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libosg.so.161()(64bit) \
libosgAnimation.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgFX.so.161()(64bit) \
libosgGA.so.161()(64bit) \
libosgManipulator.so.161()(64bit) \
libosgParticle.so.161()(64bit) \
libosgShadow.so.161()(64bit) \
libosgSim.so.161()(64bit) \
libosgTerrain.so.161()(64bit) \
libosgText.so.161()(64bit) \
libosgUI.so.161()(64bit) \
libosgUtil.so.161()(64bit) \
libosgViewer.so.161()(64bit) \
libosgVolume.so.161()(64bit) \
libosgWidget.so.161()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
