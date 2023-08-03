SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-vulkan-device-select-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "9a851e0d3e289d6e0125ef7ecc6f9d106e78b0a4324da7b9a5b00eff5562475410400db5468ab52c91258e55c5dba191bb2b60a6eb2ccde9b59f8553553f58ba"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
