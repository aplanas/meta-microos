SUMMARY = "Diagnostic utilities for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the Khronos official Vulkan tools and utilities."
LICENSE = "Apache-2.0"

PV = "1.3.261.0"

RPM_NAME = "vulkan-tools-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "575ae4d6ccc1096039dcf76e6435e2995a29a24f9f1da2c08e329f14cfc0049695997954c3afc6bc7c13971fd8329a4d8f3538ef93505a0e1d85259331c2f74e"

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
