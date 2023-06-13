SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python310-tinydb-4.7.0-1.6.noarch.rpm"
RPM_HASH = "2f00b6d210302583b5a044a5151292c563dedfcb12df79ce9217ad7a80a8f3966c6c0d82cff070d6a7acecd8f19531acce6e56a14f98b4f4a7efa8924698e825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinydb \
python3.10dist(tinydb) \
python310-tinydb \
python3dist(tinydb)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
