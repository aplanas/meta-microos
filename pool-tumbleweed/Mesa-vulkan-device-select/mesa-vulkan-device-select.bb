SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-vulkan-device-select-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "e6c63629fa5d7d781035ee15cbbb63fd6118724a3b8c7847ba68aa6c9b393183c94952c0a014ee97de26ffa96ad41d2003f2535cff11e9eb5a4a6d4bb54d8c7b"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
