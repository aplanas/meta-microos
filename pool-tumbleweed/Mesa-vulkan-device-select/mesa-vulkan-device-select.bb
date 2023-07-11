SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-vulkan-device-select-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "baa51bb287173b1b0eb6d5490c55cb5f0b96caae398349a8c7b72cb4484b24d8900cf09c7fa49d0902d7e5498e9cccc1ee0133ee8c71b5fb1fdecf74f1168615"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
