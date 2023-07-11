SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python311-tinydb-4.7.0-1.8.noarch.rpm"
RPM_HASH = "e59fad93fc924d8c824027b5347217726839b7bb5e15059a4478129ea8e6b98bab0de79073e9608c1f34b3f8ad89952e0a169701ac753668debf51d420985f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinydb \
python3.11dist-tinydb \
python311-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
