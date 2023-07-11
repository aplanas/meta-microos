SUMMARY = "Examples for rhino"
DESCRIPTION = "Examples for rhino"
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-demo-1.7.14-2.5.noarch.rpm"
RPM_HASH = "6ee6a7ee75f59bb8e18f5522e3809839dd4d60e7e0152f62817c016bb4c94b10ed29ba35b088c731500c760cad665bc3cf1978150560f40d9bbd2dcfaef64057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rhino-demo"

RDEPENDS:${PN} += ""

inherit rpm
