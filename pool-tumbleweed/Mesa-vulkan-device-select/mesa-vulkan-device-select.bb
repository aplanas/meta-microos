SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-vulkan-device-select-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "e6c63629fa5d7d781035ee15cbbb63fd6118724a3b8c7847ba68aa6c9b393183c94952c0a014ee97de26ffa96ad41d2003f2535cff11e9eb5a4a6d4bb54d8c7b"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
Mesa-vulkan-device-select(aarch-64) \
libVkLayer_MESA_device_select.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libdrm.so.2()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
