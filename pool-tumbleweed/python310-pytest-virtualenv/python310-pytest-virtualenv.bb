SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-virtualenv-1.7.0-3.8.noarch.rpm"
RPM_HASH = "32ed25dbdd905d1b6cd1aff0644f7dc2b6f92a03f6b8ae21c56f943a38bf8f4f7a6fef9c176131596c243220497f1a38f101a6d671e345a9f9b9168e88487d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-virtualenv \
python3.10dist-pytest-virtualenv \
python310-pytest-virtualenv \
python3dist-pytest-virtualenv"

RDEPENDS:${PN} += "python-abi \
python310-path.py \
python310-pytest-fixture-config \
python310-pytest-shutil \
python310-setuptools"

inherit rpm
