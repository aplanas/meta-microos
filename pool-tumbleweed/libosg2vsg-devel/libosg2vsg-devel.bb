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

RPM_NAME = "libosg2vsg-devel-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "e80d7e78b582ff6acb301c9dc909c9afb364cdc736cd2aa23bec91e1fd7953433680d9c89768b291f1c2bb250c69ddb4a1798ee0b869764e70096698562c472c"

RPROVIDES:${PN} += "cmake-osg2vsg \
libosg2vsg-devel"

RDEPENDS:${PN} += "libosg2vsg0"

inherit rpm
