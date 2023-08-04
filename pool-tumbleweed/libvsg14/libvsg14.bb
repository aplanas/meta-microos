SUMMARY = "Shared libraries for VulkanSceneGraph"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "libvsg14-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "89df84912f81bf244a25e188094a1e6d9ef66e76a84ef2c7411e557e14c0b21c5be0b428a316779c2ef8b7ba89505be6f1f08cc4bb96e906a243ae044da3db9e"

RPROVIDES:${PN} += "libvsg.so.14 \
libvsg14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libxcb.so.1"

inherit rpm
