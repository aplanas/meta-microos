SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.19.13"

RPM_NAME = "go1.19-race-1.19.13-1.1.aarch64.rpm"
RPM_HASH = "2437ad97154800e0ba6762382e4e9f368e2d3a39269fec42df6e24901490e849bb09b74c7a1040989c48acb9de17bfcde5f239bc2dd73f19cb8591f820afb992"

RPROVIDES:${PN} += "go1.19-race"

RDEPENDS:${PN} += "go1.19"

inherit rpm
