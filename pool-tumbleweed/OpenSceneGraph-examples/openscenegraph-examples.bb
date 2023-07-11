SUMMARY = "OpenSceneGraph example applications"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains some example applications built with OpenSceneGraph"
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-examples-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "47f8cba9537bde31db1f5ab783762e9eb84c88698e46bcdd552b93091f688bab7dd683521c7773ac4d4e891e1d08ac8c39c38a992adef8da5c066254670fa5a9"

RPROVIDES:${PN} += "OpenSceneGraph-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFOX-1.6.so.0 \
libGL.so.1 \
libOpenThreads.so.21 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libm.so.6 \
libosg.so.161 \
libosgAnimation.so.161 \
libosgDB.so.161 \
libosgFX.so.161 \
libosgGA.so.161 \
libosgManipulator.so.161 \
libosgParticle.so.161 \
libosgShadow.so.161 \
libosgSim.so.161 \
libosgTerrain.so.161 \
libosgText.so.161 \
libosgUI.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libosgVolume.so.161 \
libosgWidget.so.161 \
libstdc++.so.6"

inherit rpm
