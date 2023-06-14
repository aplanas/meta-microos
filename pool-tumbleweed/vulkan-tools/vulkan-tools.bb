SUMMARY = "Diagnostic utilities for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the Khronos official Vulkan tools and utilities."
LICENSE = "Apache-2.0"

PV = "1.3.250.0"

RPM_NAME = "vulkan-tools-1.3.250.0-1.1.aarch64.rpm"
RPM_HASH = "0bf36a02919db2aee4525ecedb6e8ffd76617c564159d722d6170e244fb9db92df665366bb6ef831166ce680a7ebe62563a566828bdc3d51685ed65c9e18961a"

RPROVIDES:${PN} += "vulkan \
vulkan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb.so.1"

inherit rpm
