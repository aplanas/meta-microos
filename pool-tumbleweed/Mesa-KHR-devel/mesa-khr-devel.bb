SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-KHR-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "43de2fac419e86c275e2041875728204453980941adb75b2861401d28d28a7087f719b53627e18d916256d82f9c5b5844b01a3e2f274fb9711a94f1d36d90922"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-libGL-devel-/usr/include/KHR/khrplatform.h"

RDEPENDS:${PN} += ""

inherit rpm
