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

PV = "1.0.8"

RPM_NAME = "libvsg-devel-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "64460e676c97e4ae67c0c30a0a3ac0e91270be284d0bd217da94b1ec989b5fb89a36eb22a0c310a77b0df9d3de026024b2416a89d90ae99e5b5380d3f239258d"

RPROVIDES:${PN} += "cmake-vsg \
libvsg-devel"

RDEPENDS:${PN} += "cmake-glslang \
libvsg14 \
pkgconfig-SPIRV-Tools \
pkgconfig-vulkan"

inherit rpm
