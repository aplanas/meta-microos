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

RPM_NAME = "libvsgImGui0-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "4af198f24134e5679b80d7702f6ea6d57b0be058d2a6a0470ee2e57ce17c57ca17705c6d18d0ef41bcb7509d25ac69236b8dbedfed32bfc4dd533219d85515ac"

RPROVIDES:${PN} += "libvsgImGui.so.0 \
libvsgImGui0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvsg.so.14 \
libvulkan.so.1"

inherit rpm
