SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "NCSA | MIT"

PV = "1.20"

RPM_NAME = "go-race-1.20-1.1.aarch64.rpm"
RPM_HASH = "334732814f69bba4e8f91349df35012989371df27f88bb5a5dd5bb50dbaae932174b6a3bfa3701d1fa127f36ff7c62ec8b115e76cf2ce7187f67220662f1702d"

RPROVIDES:${PN} += "go-race \
go-race(aarch-64) \
golang-race"

RDEPENDS:${PN} += "go \
go1.20-race"

inherit rpm
