SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.19.11"

RPM_NAME = "go1.19-race-1.19.11-1.1.aarch64.rpm"
RPM_HASH = "4fb71970d088e302351c03c5d721bbadfd3d45b16d08ccc4f5adfc98e2ade5f121bef0d6375e359ff8f50ec1d97dd052b952b89211910de4933baaea1f4a7a5b"

RPROVIDES:${PN} += "go1.19-race"

RDEPENDS:${PN} += "go1.19"

inherit rpm
