SUMMARY = "Cockpit user interface for Wicked"
DESCRIPTION = "Cockpit component for managing network configuration through Wicked"
LICENSE = "GPL-2.0-only"

PV = "5~git0.82629da"

RPM_NAME = "cockpit-wicked-5~git0.82629da-2.1.noarch.rpm"
RPM_HASH = "1dd2975a6b6bc717dc8644cf5ac8ecd7c4955ba481ac430621ea4ebe98c9bd6613fff188a1ddffa5ec6256866f7aa109080505de9e3a2d36e45a7ef2d428b4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-wicked"

RDEPENDS:${PN} += "cockpit-bridge \
wicked"

inherit rpm
