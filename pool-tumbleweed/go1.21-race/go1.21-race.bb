SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.21.1"

RPM_NAME = "go1.21-race-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "d71f8248641c76933239e6c463fcf581f5ecc535f1dd081671d67acb9bc0bb321db983837f030e391bfe94579e46fd1363af6976218a4086aea3142e1167878c"

RPROVIDES:${PN} += "go1.21-race"

RDEPENDS:${PN} += "go1.21"

inherit rpm
