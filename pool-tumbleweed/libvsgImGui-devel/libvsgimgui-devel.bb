SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the header and development files for vsgImGui."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libvsgImGui-devel-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "b77ae044d5f9d3589306dbb07baf1d7448cc70acf37e7841a22f3f1c6da66336f5633f510ca67a31fb712aea97a253713fb89061848d558d0b8af8be12c86230"

RPROVIDES:${PN} += "cmake-vsgImGui \
libvsgImGui-devel"

RDEPENDS:${PN} += "libvsgImGui0"

inherit rpm
