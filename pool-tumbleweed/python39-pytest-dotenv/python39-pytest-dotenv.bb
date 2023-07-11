SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python39-pytest-dotenv-0.5.2-1.14.noarch.rpm"
RPM_HASH = "59a35bd5cc6674e8aff4897c1c6c411a6626dde3045a9bb02dd7dd31a6820114166a5daf04be622ece651582a369794a63beae7e4b47f365268a24db099fc7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-dotenv \
python39-pytest-dotenv \
python3dist-pytest-dotenv"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-python-dotenv"

inherit rpm
