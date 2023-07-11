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

RPM_NAME = "libosg2vsg0-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "021b073588ab1616866a94bfeb1c517bddc57fb760b5dc92e1813cafa52f71d7479a59f06429c8109a749020b1972bb4f79db2994395480b4002f4dfe13f5baf"

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
libvsg.so.13"

inherit rpm
