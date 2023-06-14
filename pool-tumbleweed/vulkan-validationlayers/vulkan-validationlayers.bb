SUMMARY = "Validation layers for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API. \
 \
This package contains the Khronos official Vulkan validation layers."
LICENSE = "Apache-2.0"

PV = "1.3.250.0"

RPM_NAME = "vulkan-validationlayers-1.3.250.0-1.1.aarch64.rpm"
RPM_HASH = "162c8f805c7a803b4250a580de1f2b777f39bdaa1bb2a97f171a0ddf66acd7fb4fe36347b0d06ee47d7be816f27d3ef9a6a43972c3003b2225adb73da76f4e92"

RPROVIDES:${PN} += "libVkLayer-khronos-validation.so \
vulkan-validationlayers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.3~rc1.so \
libSPIRV-Tools-opt-2023.3~rc1.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxxhash.so.0"

inherit rpm
