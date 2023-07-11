SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.19.10"

RPM_NAME = "go1.19-race-1.19.10-1.1.aarch64.rpm"
RPM_HASH = "fd9e05f7276426884ce38c713ec6ffd79c16b8f9edcaa26aa462003c746d2b1c9aedad2cd324f9ba903f86ce5829a5cc011b351473612c2f971745d57c5b0596"

RPROVIDES:${PN} += "go1.19-race"

RDEPENDS:${PN} += "go1.19"

inherit rpm
