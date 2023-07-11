SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.14.15"

RPM_NAME = "go1.14-race-1.14.15-1.14.aarch64.rpm"
RPM_HASH = "c95173572be2c2c89136762185cf1047ee84cb334af017d8680218e735971435f3198d02f0763968046b07798cfa95a791d298f3a6d1dda75fa2ce603a42c9e0"

RPROVIDES:${PN} += "go1.14-race"

RDEPENDS:${PN} += "go1.14"

inherit rpm
