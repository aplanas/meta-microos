SUMMARY = "Shared libraries for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the shared libraries for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenSceneGraph161-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "deceed009c6595e45e53b507b31692ec465f06f05d722512f6be5ab232d3bec56f169be351191e6551207d0e902dcb0c4d2969930b3a5e48f81b497120ea6afa"

RPROVIDES:${PN} += "libOpenSceneGraph161 \
libosg.so.161 \
libosgAnimation.so.161 \
libosgDB.so.161 \
libosgFX.so.161 \
libosgGA.so.161 \
libosgManipulator.so.161 \
libosgParticle.so.161 \
libosgPresentation.so.161 \
libosgShadow.so.161 \
libosgSim.so.161 \
libosgTerrain.so.161 \
libosgText.so.161 \
libosgUI.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libosgVolume.so.161 \
libosgWidget.so.161"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenThreads.so.21 \
libX11.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
