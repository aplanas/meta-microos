SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the development header and libraries for vsgXchange."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libvsgXchange-devel-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "ed7c396311d77d786b44fbcdf08e89eb6de27fdc0328caf90faeeae1b80da0823a54445db9d5009b7b9eb5ce49ce9f0e39e780bc24fe3e913f556cc513f9ee85"

RPROVIDES:${PN} += "cmake-vsgXchange \
libvsgXchange-devel"

RDEPENDS:${PN} += "libvsgXchange1"

inherit rpm
