SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "NCSA | MIT"

PV = "1.21"

RPM_NAME = "go-race-1.21-1.1.aarch64.rpm"
RPM_HASH = "56b572f147b8cdda070f0ecd2a9941d435f07f304cf6af7c263b61f4995c8b663c57b633b3e92a88cb55a3394d363df0325803196293d24d0437706a39d03fb7"

RPROVIDES:${PN} += "go-race \
golang-race"

RDEPENDS:${PN} += "go \
go1.21-race"

inherit rpm
