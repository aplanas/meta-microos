SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python39-pytest-metadata-2.0.4-2.1.noarch.rpm"
RPM_HASH = "8e1c6be6a06435137248f7e8450a4dfcafad677298b65ee1ef019af857adfe2de8a4d94388557f5e5b69f918c22bc07e0d8a2b13564ac9163e74000a94f10fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-metadata) \
python39-pytest-metadata \
python3dist(pytest-metadata)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
