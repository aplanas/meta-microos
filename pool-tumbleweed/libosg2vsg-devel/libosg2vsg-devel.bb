SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the header and development files for osg2vsg."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libosg2vsg-devel-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "234cd20999f12fae3b0628a540ddf0876c2074421ada2f89404d153648e6b8eaf00b3ead7e86c6a33a7513e09ce80bcc4b8e7a591429db96f39b380199dff35f"

RPROVIDES:${PN} += "cmake-osg2vsg \
libosg2vsg-devel"

RDEPENDS:${PN} += "libosg2vsg0"

inherit rpm
