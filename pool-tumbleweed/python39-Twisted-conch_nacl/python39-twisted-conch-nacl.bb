SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch_nacl-22.10.0-7.1.noarch.rpm"
RPM_HASH = "b02bb3a85312b2ee28fdfae8c2e87de9b1dd7702ad5411bda16d40192ef5bfae0bee8fbd9385da1c8af77870e2bfdae31cf762012162fe5051444816d299b4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch-nacl"

RDEPENDS:${PN} += "python39-Twisted-conch"

inherit rpm
