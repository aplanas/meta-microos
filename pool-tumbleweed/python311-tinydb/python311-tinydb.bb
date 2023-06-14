SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python311-tinydb-4.7.0-1.6.noarch.rpm"
RPM_HASH = "e830204c11f28e21a4b7819341499f6022b63061ffe2b5bbc4031d53f21a9fbc77d4f67a4e32727504765cec32c260f7cdb33126d3ac48f903478ae1a51b343b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tinydb \
python311-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
