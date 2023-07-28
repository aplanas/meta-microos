SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python311-tinydb-4.8.0-1.1.noarch.rpm"
RPM_HASH = "f8e9a3af478079012a8c9ae7de5bd280b03a248adc72062a9ed0a33dacc23516e64f6e77db02b874d725bd025c5218bde41915ac49a05c2d1ab57c852dd65871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinydb \
python3.11dist-tinydb \
python311-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
