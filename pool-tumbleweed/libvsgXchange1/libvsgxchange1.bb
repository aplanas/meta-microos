SUMMARY = "Shared libraries for vsgXchange"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for vsgXchange."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libvsgXchange1-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "3ce341470c5dcd1546c751a7a15f5c5532344a6057a8631571e03c757104b923e6eb262d4eb1ead68e0aae675881f208a0ec8561d64ddb94e843cd5ccbffc6ba"

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
libvsg.so.14 \
libvulkan.so.1"

inherit rpm
