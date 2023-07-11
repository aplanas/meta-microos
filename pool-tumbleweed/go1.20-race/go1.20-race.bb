SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.20.5"

RPM_NAME = "go1.20-race-1.20.5-1.1.aarch64.rpm"
RPM_HASH = "27e9c961b50465d3e6fa82b63c526b05b70fa6f0f1db2d360817b072ad24728cfd96fd18028c07008240e3af6c59dce5006b63739f1465522b06a8a76faaa034"

RPROVIDES:${PN} += "go1.20-race"

RDEPENDS:${PN} += "go1.20"

inherit rpm
