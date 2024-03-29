SUMMARY = "Plugins for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains some plugins for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugins-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "08e9ec1275feaebd79ac1396c5d0042b548a17b06b9b02df80ef733731c8258dc5e146f496f4213c2f9557838a46f5d4f85970e8a9894fa95ef3d4ae5078c7be"

RPROVIDES:${PN} += "OpenSceneGraph-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenThreads.so.21 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libdcmdata.so.17 \
libdcmimage.so.17 \
libdcmimgle.so.17 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libofstd.so.17 \
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
libosgWidget.so.161 \
libpng16.so.16 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libvncclient.so.1 \
libz.so.1"

inherit rpm
