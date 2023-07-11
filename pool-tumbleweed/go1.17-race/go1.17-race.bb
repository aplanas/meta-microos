SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-race-1.17.13-5.2.aarch64.rpm"
RPM_HASH = "2773d48691c4a5c3d09582eceb7df084ee2380c081e681756280ae7255bec5f8d4608833919897a2a1e42331ce279bdd00073667a1c89e06d6196bda8cb7ace0"

RPROVIDES:${PN} += "go1.17-race"

RDEPENDS:${PN} += "go1.17"

inherit rpm
