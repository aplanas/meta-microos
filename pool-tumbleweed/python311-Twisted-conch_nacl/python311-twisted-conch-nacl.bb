SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch_nacl-22.10.0-8.1.noarch.rpm"
RPM_HASH = "fefe85b1254e078517a45cc27c52cd61c9a8bbf72b8e49ccc5c338865974ff2cb8c495afc320d02dad30d09bbc611b91f20842633051e04ec6d9cc4fb93e9d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch-nacl \
python311-Twisted-conch-nacl"

RDEPENDS:${PN} += "python311-Twisted-conch"

inherit rpm
