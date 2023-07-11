SUMMARY = "Development files for the Mesa GL API implementation"
DESCRIPTION = "Development files for the Mesa GL API module which is responsible for \
dispatching all the gl* functions. It is intended to be mainly used by \
the Mesa-libGLES* packages."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libglapi-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "f3f468893575aaa4fb0f731386f0b3919de68dc5d9b84dee999352d087da03cc43c4e415e72e445057992234a20188b7755a79e2f639a5a79708946d47293e31"

RPROVIDES:${PN} += "Mesa-libglapi-devel"

RDEPENDS:${PN} += "Mesa-libglapi0"

inherit rpm
