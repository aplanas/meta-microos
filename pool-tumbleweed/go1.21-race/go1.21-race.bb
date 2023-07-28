SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.21rc3"

RPM_NAME = "go1.21-race-1.21rc3-1.1.aarch64.rpm"
RPM_HASH = "c48a9c9218b214e63ba95a1576ab3ccdfa05ff04d097b3d77cb8a54a94eefbb18bee79b98c38fb1899a4b7c477e65fac561ebef0ec15199c2b845e8c6cb91d7b"

RPROVIDES:${PN} += "go1.21-race"

RDEPENDS:${PN} += "go1.21"

inherit rpm
