SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python39-tinydb-4.8.0-1.1.noarch.rpm"
RPM_HASH = "7b2b9d9fbeb29308ebdbb7f922133630b48fa14dd915af2b85dc735edb983f22ca69c36aeadb6dcc63c17dbf81312c366c38b9b819256c2cb277ac4a7e374a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinydb \
python39-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
