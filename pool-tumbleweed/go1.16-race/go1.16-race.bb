SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.16.15"

RPM_NAME = "go1.16-race-1.16.15-6.1.aarch64.rpm"
RPM_HASH = "395fb9047d4bc862154e41d6fbd5a73d922a0015ed1ebc4c4db1ca8dcaf81e5f99ba8b03d540a01e1579307b33e0d0a4a08b93ad1f95d896d324abaea4a120fb"

RPROVIDES:${PN} += "go1.16-race"

RDEPENDS:${PN} += "go1.16"

inherit rpm
