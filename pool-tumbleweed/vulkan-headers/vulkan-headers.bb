SUMMARY = "Vulkan C and C++ API header files"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.3.250.0"

RPM_NAME = "vulkan-headers-1.3.250.0-1.1.noarch.rpm"
RPM_HASH = "bd8e6858f0fdb19d9f55fc0e1c2ebe5e64883184231ce605e0627344753a1fdb499bc6bf61d83295613144f98e2f6c1617ef255feb20b568e21d223587efb31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(VulkanHeaders) \
vulkan-headers"

RDEPENDS:${PN} += "/usr/bin/python3 \
pkgconfig(wayland-client) \
pkgconfig(x11) \
pkgconfig(xcb) \
pkgconfig(xrandr)"

inherit rpm
