SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python310-tinydb-4.8.0-1.1.noarch.rpm"
RPM_HASH = "220438170ee64c525bca9a2a663cc3a330974ffc158fb3d976703530ca8c5a3811de1820d6d8cef82052753cefb44fbf28bf5d521c62b760f472196560546209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tinydb \
python310-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
