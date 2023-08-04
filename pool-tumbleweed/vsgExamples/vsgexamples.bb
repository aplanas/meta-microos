SUMMARY = "3D graphics toolkit"
DESCRIPTION = "Example programs that test and illustrate how to use the VulkanSceneGraph and optional add-on libraries"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "vsgExamples-1.0.6-1.1.aarch64.rpm"
RPM_HASH = "8804bb2d93220433dd1243f9225d97af07faa2ca3db6e862a1a93ffd0816c41dd044c3ae143698d22b2891fa831e5068a3f8705098070b94d8da7e200a4d9cc0"

RPROVIDES:${PN} += "config-vsgExamples \
vsgExamples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvsg.so.14 \
libvsgImGui.so.0 \
libvsgXchange.so.1 \
libvulkan.so.1"

inherit rpm
