SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.20.8"

RPM_NAME = "go1.20-race-1.20.8-1.1.aarch64.rpm"
RPM_HASH = "e2b0f671ea4302e1e60796c14ad2a5280d75f462a03800d0ff1e84b776247cec216746786b74ef51d813ab1278b178fd83bfcf44046699d21ec53aaa46a1c212"

RPROVIDES:${PN} += "go1.20-race"

RDEPENDS:${PN} += "go1.20"

inherit rpm
