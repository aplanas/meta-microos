SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "go1.21-race-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "14542705cd597723ee47af778ced9bdd509c15298a994989d7eece5ebbeffefc2d42f3cd41e93cf33bb570acf00ba021c1b8145e1d2b8c50047065d58658dcfe"

RPROVIDES:${PN} += "go1.21-race"

RDEPENDS:${PN} += "go1.21"

inherit rpm
