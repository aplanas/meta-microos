SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python39-tinydb-4.7.0-1.8.noarch.rpm"
RPM_HASH = "ddfc80cf6db145dd00bc64e45df56534bc2d76dbdebad7d8942bd647af3def472c0d176ee5b95c18d31d435fef67f1831917c2d3958d922b5c3fb993b5e0b257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinydb \
python39-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
