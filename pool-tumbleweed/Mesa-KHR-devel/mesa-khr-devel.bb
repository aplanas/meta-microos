SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-KHR-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "e57b6ad68e890dd061df5781f394ed2500aa1c907a4e5f746f3906a6c522b19376efecf9bb1140192282016b975c1b39b099815b72d6d037b6cb22f2d898fb36"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-libGL-devel-/usr/include/KHR/khrplatform.h"

RDEPENDS:${PN} += ""

inherit rpm
