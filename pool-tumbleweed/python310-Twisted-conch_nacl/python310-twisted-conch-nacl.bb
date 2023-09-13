SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch_nacl-22.10.0-8.1.noarch.rpm"
RPM_HASH = "4fa1b79dbad506fed4bd55364722a674f7cb12d3402e7bce24e71aa5de20e415e7b1edb8924e29ffb9f949ac67135279bd8dc04402870e4cfc755eb4836354e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-conch-nacl"

RDEPENDS:${PN} += "python310-Twisted-conch"

inherit rpm
