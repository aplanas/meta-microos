SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.20.7"

RPM_NAME = "go1.20-race-1.20.7-1.1.aarch64.rpm"
RPM_HASH = "db2846a932e98f95d3a992642b5896fcfa5a6ccac206adf794860f0d6af67fd1299f3c919aea2b7633d524b313615cf6c8f7f3d349686cd9130c14eaa9611adb"

RPROVIDES:${PN} += "go1.20-race"

RDEPENDS:${PN} += "go1.20"

inherit rpm
