SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-race-1.18.10-4.2.aarch64.rpm"
RPM_HASH = "15234fc23268701abd0a157f04ee8f13d44706ecd65796b70ca222dc9acc3ee72eb44920c014d29bd1b8fcd4ae83adbf6443b62cf3aa214114718d8459848ce8"

RPROVIDES:${PN} += "go1.18-race"

RDEPENDS:${PN} += "go1.18"

inherit rpm
