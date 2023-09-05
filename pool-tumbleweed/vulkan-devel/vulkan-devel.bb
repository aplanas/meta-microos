SUMMARY = "Vulkan development package"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This subpackage contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.3.261.0"

RPM_NAME = "vulkan-devel-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "c65da25057163eab34e7951f8198d54928f7b45161338680b81adfbeac0d8785556349bcbebeb69b8d20fef5467315e63d7996586561b484dc5331b61a1da16e"

RPROVIDES:${PN} += "pkgconfig-vulkan \
vulkan-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvulkan1 \
vulkan-headers"

inherit rpm
