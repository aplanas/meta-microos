SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.20.4"

RPM_NAME = "go1.20-race-1.20.4-1.1.aarch64.rpm"
RPM_HASH = "ad00a7ce8209a4dec44e7532ccee4673cabd4c343f2a621cbeb5864601b8a4648a00c27a5b3e437032be80caca67888bd782279995a9e8d6ec835c189dcda658"

RPROVIDES:${PN} += "go1.20-race \
go1.20-race(aarch-64)"

RDEPENDS:${PN} += "go1.20"

inherit rpm
