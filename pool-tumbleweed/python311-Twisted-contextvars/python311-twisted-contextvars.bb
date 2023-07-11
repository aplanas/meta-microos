SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-contextvars-22.10.0-7.1.noarch.rpm"
RPM_HASH = "2ec71a8eb8f965babe61bb6db38139d4700fca3114564e58ff6700cd29507f9d3665f1733d193a5d21d5b7c95d5b3e94447fc6e58315a0c890c9134ea4e76958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-contextvars \
python311-Twisted-contextvars"

RDEPENDS:${PN} += "python311-Twisted"

inherit rpm
