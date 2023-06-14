SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-virtualenv-1.7.0-3.8.noarch.rpm"
RPM_HASH = "01771ddbe04693d5cd3618337af2dfd63c2a971d6ee9681b19ade4eb48596169aff307f57b22f2ab6d12a68aecccf822cdec34f9bd19e127db722f4a77b59e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-virtualenv \
python39-pytest-virtualenv \
python3dist-pytest-virtualenv"

RDEPENDS:${PN} += "python-abi \
python39-path.py \
python39-pytest-fixture-config \
python39-pytest-shutil \
python39-setuptools"

inherit rpm
