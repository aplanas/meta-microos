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

RPM_NAME = "libvsgImGui-devel-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "4f47890b3617a7cfbd1437616cdcacb4be11f02ae9f1a41db5d55effa1418a732e33166d86e04850dc11d08930fa526843b85beef26b703c7eb98042f3fed7ac"

RPROVIDES:${PN} += "cmake-vsgImGui \
libvsgImGui-devel"

RDEPENDS:${PN} += "libvsgImGui0"

inherit rpm
