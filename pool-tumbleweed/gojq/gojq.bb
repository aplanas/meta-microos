SUMMARY = "Pure Go implementation of jq"
DESCRIPTION = "Pure Go implementation of jq."
LICENSE = "MIT"

PV = "0.12.13"

RPM_NAME = "gojq-0.12.13-1.2.aarch64.rpm"
RPM_HASH = "6ed0bd2bfc3142c65bec2713a67b62f11200c1302b3c9b55e699ebdee691f5d87683179b61007010716b1cd34956fab31efa228e3d79160c90835b036c325c5c"

RPROVIDES:${PN} += "gojq"

RDEPENDS:${PN} += ""

inherit rpm
