SUMMARY = "Shared libraries for osg2vsg"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for osg2vsg"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libosg2vsg0-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "c90e388f94097224e9c90f85033fc514fc9a9b6a9ad64f6c1338dba20d1ab3b8a890a09f6a4cdad6a936fc9a57ee6298218a108b0bc81b8c85b06ad1de52a5e1"

RPROVIDES:${PN} += "libosg2vsg.so.0 \
libosg2vsg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosg.so.161 \
libosgDB.so.161 \
libosgTerrain.so.161 \
libosgUtil.so.161 \
libstdc++.so.6 \
libvsg.so.14"

inherit rpm
