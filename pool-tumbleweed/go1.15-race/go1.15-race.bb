SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.15.15"

RPM_NAME = "go1.15-race-1.15.15-1.13.aarch64.rpm"
RPM_HASH = "b70bd9d17d21f86be5f93286259f46779bce12ec037a69b3cbf7c3ad396218b464d07270313221f3af5314a00654019128ebaa2634300ee4389f14cf1a897527"

RPROVIDES:${PN} += "go1.15-race"

RDEPENDS:${PN} += "go1.15"

inherit rpm
