SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the development header and libraries for vsgXchange."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libvsgXchange-devel-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "ac03315a86d8c2b9f78505180734156302c2e164f513fdef87f832213ecd424700a3a322334bd4b3c921bce97f4f14b3b8e9615839cd5496d6d474ce3baa26da"

RPROVIDES:${PN} += "cmake-vsgXchange \
libvsgXchange-devel"

RDEPENDS:${PN} += "libvsgXchange1"

inherit rpm
