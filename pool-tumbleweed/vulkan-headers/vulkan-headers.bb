SUMMARY = "Vulkan C and C++ API header files"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.3.261.0"

RPM_NAME = "vulkan-headers-1.3.261.0-1.1.noarch.rpm"
RPM_HASH = "d0f1a1e230453e01da8e04d907d505415ebed9a5926901e24dec2487f5f2547ac435c9e775e588e967532cd9c98dd0e3270ffac37b943a99899467356a056073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-VulkanHeaders \
vulkan-headers"

RDEPENDS:${PN} += "/usr/bin/python3 \
pkgconfig-wayland-client \
pkgconfig-x11 \
pkgconfig-xcb \
pkgconfig-xrandr"

inherit rpm
