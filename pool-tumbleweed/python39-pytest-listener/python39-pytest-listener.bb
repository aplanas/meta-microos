SUMMARY = "A simple network listener for py.test"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-listener-1.7.0-4.5.noarch.rpm"
RPM_HASH = "968fca51c0cc1d5063d71237a0aadf95095c5eb7a124b50d245b9b419efa5ea661c6099865fa0cee8b8211980574a7c4d38ed6af54b3db460a80307d6c3e7632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-listener \
python39-pytest-listener \
python3dist-pytest-listener"

RDEPENDS:${PN} += "python-abi \
python39-pytest-server-fixtures"

inherit rpm
