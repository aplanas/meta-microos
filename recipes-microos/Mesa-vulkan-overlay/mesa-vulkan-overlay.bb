SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-vulkan-overlay-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "3498d3511d6748e4895fe49a374747b4b4c3ef72feb79a49520acc5f6a8de584925603a933cf60c9fc5a34122dbc3ee06fb4d6e9aa0b518787bba7e5effdaee7"

RPROVIDES:${PN} += "Mesa-vulkan-overlay Mesa-vulkan-overlay(aarch-64) libVkLayer_MESA_overlay.so()(64bit)"
RDEPENDS:${PN} += "/usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
