SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-KHR-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "b98228fd46efdd9dd359bcef073bf6a60ed31a5ffed781a7962ae9e81f4a99f772c59ffcb9c8c1f419ec548368e9e33dffcbf8293c599ad6652e30e370fbf00e"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-KHR-devel(aarch-64) \
Mesa-libGL-devel:/usr/include/KHR/khrplatform.h"
RDEPENDS:${PN} += ""

inherit rpm
