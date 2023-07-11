SUMMARY = "Shared libraries for vsgImGui"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for ImGui."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libvsgImGui0-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "022cf6da286a0ecfc90254dfd28872e0c30bbe52f97d83250f79543caf3fe45711233e4e88f12317c63be0695a27d7929ce093cb3b3a23e59ccdd9e959fb19ee"

RPROVIDES:${PN} += "libvsgImGui.so.0 \
libvsgImGui0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvsg.so.13 \
libvulkan.so.1"

inherit rpm
