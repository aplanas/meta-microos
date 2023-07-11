SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the header and development files for \
VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libvsg-devel-1.0.7-1.1.aarch64.rpm"
RPM_HASH = "cee426b759b4715a6ddea6d420b9f6c81ab29a9f31deb77070e5f1f2460e1abe375c6e9e72ebce7751d305c5b79db2eb4c8550870c5ea4ada9a68c602476e4a7"

RPROVIDES:${PN} += "cmake-vsg \
libvsg-devel"

RDEPENDS:${PN} += "cmake-glslang \
libvsg13 \
pkgconfig-SPIRV-Tools \
pkgconfig-vulkan"

inherit rpm
