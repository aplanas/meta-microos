SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-vulkan-overlay-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "a60199f87ee372257c87b2e7382a9897a1783bb0911110ce341461ab619478ed5d9cdc8d18eb879837fb15a7f296f3979f2159802a20c1a09ad1b2391cc30acc"

RPROVIDES:${PN} += "Mesa-vulkan-overlay Mesa-vulkan-overlay(aarch-64) libVkLayer_MESA_overlay.so()(64bit)"
RDEPENDS:${PN} += "/usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
