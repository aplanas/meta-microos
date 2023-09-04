SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-vulkan-device-select-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "40b4deedfcd9bf9e48a2f1c8f335ec2c193fd6fd121af81664711767270df6bc2e27aad51ad3d36ecb3fc6073daf90530d4dbdf549cdc823a64880ce53fbd849"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
