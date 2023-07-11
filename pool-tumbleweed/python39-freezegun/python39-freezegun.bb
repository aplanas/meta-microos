SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python39-freezegun-1.2.2-2.3.noarch.rpm"
RPM_HASH = "ae1768debf6b81a8e5b331132f1d080bafdea5eac3427c8618b36b0289420800833dd549337eb1c468b6f86f6805890d9de690eb314acacac769dda1fde75bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-freezegun \
python39-freezegun \
python3dist-freezegun"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-python-dateutil"

inherit rpm
