SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-pyramid-server-1.7.0-2.6.noarch.rpm"
RPM_HASH = "460a8b6445dc141c087e76e44d8365cddbe8e34f13730be2749c152acc3639dbbf3dedc3f555f6e4afe0b14dd9cfaf1b24e0614e4395d14b925999cd0104e689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-pyramid-server \
python39-pytest-pyramid-server \
python3dist-pytest-pyramid-server"

RDEPENDS:${PN} += "python-abi \
python39-pyramid \
python39-pytest-server-fixtures \
python39-six \
python39-waitress"

inherit rpm
