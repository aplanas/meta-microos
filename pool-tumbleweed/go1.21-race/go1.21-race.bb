SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.21rc2"

RPM_NAME = "go1.21-race-1.21rc2-1.1.aarch64.rpm"
RPM_HASH = "4abf9438d988ed0894e87ae774fa7c1472e2bef89f00561b429db52e915dbac44baa3e2f6033eace8c651be256edce18ffca4000bb35c130e14765b5bb1c4ff8"

RPROVIDES:${PN} += "go1.21-race"

RDEPENDS:${PN} += "go1.21"

inherit rpm
