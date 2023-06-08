SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-vulkan-device-select-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "07739fd5bf41614d61e816ac83dedb58805d633af96d4aedcc900aa7f4f9bfb68aa41808465c4f67e9c298e27b1a1cccd17f7b2ba196ff44d307ba54b40c2ef8"

RPROVIDES:${PN} += "Mesa-vulkan-device-select Mesa-vulkan-device-select(aarch-64) libVkLayer_MESA_device_select.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libdrm.so.2()(64bit) libwayland-client.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
