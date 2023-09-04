SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.19.12"

RPM_NAME = "go1.19-race-1.19.12-1.1.aarch64.rpm"
RPM_HASH = "3258ce94d1df5bcaefc76b6deecf48b2078eff6b18236a7745a1eb6e0052feb15d4cd930b069b42f80c17956c403377c34df08864e141184dbfb5aa378d7167f"

RPROVIDES:${PN} += "go1.19-race"

RDEPENDS:${PN} += "go1.19"

inherit rpm
