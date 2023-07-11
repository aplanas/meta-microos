SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-virtualenv-1.7.0-4.3.noarch.rpm"
RPM_HASH = "5ff5bba6fb7f34ce812ba1d4b4f83e8776a6dba582a36f9fe06650891715885e441bde27dda15da762f35f967e68a2aafff3a2fc65f706f4bbaf8ce3ffc78b76"
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
