SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-vulkan-device-select-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "165f853b447c0a247d7eff8c4dd1dc09941ed548c02705183ba1db6358bb47ed87ff2b20953c773f6f03d4c9f7a416c0d797ec7996f57330630cfd1639a5e5b9"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
