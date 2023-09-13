SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-vulkan-device-select-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "955b040decb94ba3a02f38677dcdc69c583c7499a2d4071fa168b9bd8d87f67ebe76574b748ff7d0789e5c4bb72e5ae35243b02f9049a896f30b63ee80357db2"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
