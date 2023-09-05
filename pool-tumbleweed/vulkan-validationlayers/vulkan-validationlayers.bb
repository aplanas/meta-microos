SUMMARY = "Validation layers for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API. \
 \
This package contains the Khronos official Vulkan validation layers."
LICENSE = "Apache-2.0"

PV = "1.3.261.0"

RPM_NAME = "vulkan-validationlayers-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "212e4d8238ca006454baf902fc887835449f0faa4b3f129c036f086d98bd70206f846b465e7f924d24edf52a1c74b65dc24827b04ba8daa0c7fea47c3eb9ffca"

RPROVIDES:${PN} += "libVkLayer-khronos-validation.so \
vulkan-validationlayers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxxhash.so.0"

inherit rpm
