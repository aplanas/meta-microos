SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-KHR-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "4af807671069101a1b6881e8b12d2e5c0948156cac675deb22cfe10ddf5f8bc33fb2ebde19c462930c51a01bc343592626c55069547361d37f8bec17620757ff"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-libGL-devel-/usr/include/KHR/khrplatform.h"

RDEPENDS:${PN} += ""

inherit rpm
