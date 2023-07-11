SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-contextvars-22.10.0-7.1.noarch.rpm"
RPM_HASH = "6be6e2dbe6e29d19d86cdc9a6eb9e63c2394e3a0fbf6805bd89486f9f26a19d6a5ccd55518686c01f3bbf3697937bcf887d778b095bc7fc3dd6896455044aed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-contextvars"

RDEPENDS:${PN} += "python39-Twisted"

inherit rpm
