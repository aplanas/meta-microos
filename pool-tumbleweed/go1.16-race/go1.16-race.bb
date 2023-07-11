SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.16.15"

RPM_NAME = "go1.16-race-1.16.15-6.2.aarch64.rpm"
RPM_HASH = "0f908528c6e3ff5fe208b5dd85000f2f18fef869a3659da2c407dd62ad38e4ffd5a0374cf27d46fa4245dfebe39aa4d58a7a251ba21d82acc8ab96903de79aad"

RPROVIDES:${PN} += "go1.16-race"

RDEPENDS:${PN} += "go1.16"

inherit rpm
