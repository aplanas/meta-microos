SUMMARY = "3D graphics toolkit"
DESCRIPTION = "Example programs that test and illustrate how to use the VulkanSceneGraph and optional add-on libraries"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "vsgExamples-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "b240571fc7e64dd34418e7f16c437de093f365cd528ea2ad62949da93ea6c08b3dba8aac7dd3f70919d7662136a18a110ddaa280514a1aa88243e136a549c608"

RPROVIDES:${PN} += "config-vsgExamples \
vsgExamples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvsg.so.13 \
libvsgImGui.so.0 \
libvsgXchange.so.1 \
libvulkan.so.1"

inherit rpm
