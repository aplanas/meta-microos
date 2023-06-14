SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.15.15"

RPM_NAME = "go1.15-race-1.15.15-1.12.aarch64.rpm"
RPM_HASH = "1e651b3a4f5a83f0a2114a242af9db6da429f812f62aba619edf4596657136d44d60b0a0e1e6618aa05527747bc95c57dc4a1e13ac78bdbe24d52c56912fca74"

RPROVIDES:${PN} += "go1.15-race"

RDEPENDS:${PN} += "go1.15"

inherit rpm
