SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.20.6"

RPM_NAME = "go1.20-race-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "7d5606181a4d75bcaf129d0397f759c8a8a130181744de0f701d3c978fa03232d1bec3ab6092d53021dd65bef8b04ed1651350420e193a966312e8cd39c1433b"

RPROVIDES:${PN} += "go1.20-race"

RDEPENDS:${PN} += "go1.20"

inherit rpm
