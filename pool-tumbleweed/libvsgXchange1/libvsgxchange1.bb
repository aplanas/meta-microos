SUMMARY = "Shared libraries for vsgXchange"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for vsgXchange."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libvsgXchange1-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "9b49d39a6287996d41fa67068d7f2cda4d22bff82ce11da60a6f6ae5731cf7ef5dca5ac1e01e968e5d0901502dc469ae388583a6ef05a8ec609358bf3baf8290"

RPROVIDES:${PN} += "libvsgXchange.so.1 \
libvsgXchange1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libassimp.so.5 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libm.so.6 \
libosg2vsg.so.0 \
libstdc++.so.6 \
libvsg.so.13 \
libvulkan.so.1"

inherit rpm
