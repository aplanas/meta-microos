SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python310-tinydb-4.7.0-1.8.noarch.rpm"
RPM_HASH = "408f84aad7ef4e89831454d4ab53069ab4cb18ab00c323ad727fbeb4417b8d42fcc03eeb8b4436d697059c65a843f2f61d4e94ee79c56d4266602e12c00f6dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tinydb \
python310-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
