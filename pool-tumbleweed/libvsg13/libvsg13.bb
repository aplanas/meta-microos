SUMMARY = "Shared libraries for VulkanSceneGraph"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libvsg13-1.0.7-1.1.aarch64.rpm"
RPM_HASH = "19d68a09c859101e815537c00a1d10039ea9b7094b70b9806c770d39d93d747ad2ff89812fcb1f119acd3f2ab45593634512b173f1d6cb35689d0659a6891f11"

RPROVIDES:${PN} += "libvsg.so.13 \
libvsg13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libxcb.so.1"

inherit rpm
