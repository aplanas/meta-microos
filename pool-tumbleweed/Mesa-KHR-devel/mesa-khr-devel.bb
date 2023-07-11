SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-KHR-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "52f2ae83a2903ee713ae1a2b1d73b491180a7da7d37c17a30b2dfdb52bdad1b3df7d8f5ac9918ebc155c9578f930a26ca05e193751b73eebf6f001518e023e21"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-libGL-devel-/usr/include/KHR/khrplatform.h"

RDEPENDS:${PN} += ""

inherit rpm
