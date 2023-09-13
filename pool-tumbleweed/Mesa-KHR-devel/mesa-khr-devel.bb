SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-KHR-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "ece0785b3294d3d998aa2001016f8ff9fc3864e745e73050f5ce7834190c7964a2ebda20b3bce280b44f0045348fef60a83dca1d49988bc1d068edc7120f5215"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-libGL-devel-/usr/include/KHR/khrplatform.h"

RDEPENDS:${PN} += ""

inherit rpm
