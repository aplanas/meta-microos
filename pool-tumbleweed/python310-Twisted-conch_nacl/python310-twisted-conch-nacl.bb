SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch_nacl-22.10.0-7.1.noarch.rpm"
RPM_HASH = "5e0e3bab4a353bcd339931c90eb076f5f77a4ec32931e25fbf92cedc084b028c51ba142d9f3a86cf09036059bbbe3c719e501592e8bc07fd9a1b7ef782f31563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-conch-nacl"

RDEPENDS:${PN} += "python310-Twisted-conch"

inherit rpm
