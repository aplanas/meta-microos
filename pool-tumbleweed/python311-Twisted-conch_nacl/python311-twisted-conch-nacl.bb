SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature Conch with NaCl"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch_nacl-22.10.0-6.1.noarch.rpm"
RPM_HASH = "ed9bd3f139614b62e93b66cfc27a6b8f525f5d14e0e9350ce3d36e200ab6ee3540c7bb448b22666643193c33cd532be2ab73fca11e3bbd7535206a99273502e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-conch-nacl"

RDEPENDS:${PN} += "python311-PyNaCl \
python311-Twisted-conch"

inherit rpm
