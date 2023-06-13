SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-virtualenv-1.7.0-3.8.noarch.rpm"
RPM_HASH = "c35cc74e0590f90b2f8ec15982cc509dad0ab11e96f656711a50a4077ee52cec138ebe9bc197c46be48ac1e23158dce1634b8ac77d6aeae1eed616004f6ed935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-virtualenv) \
python311-pytest-virtualenv \
python3dist(pytest-virtualenv)"

RDEPENDS:${PN} += "python(abi) \
python311-path.py \
python311-pytest-fixture-config \
python311-pytest-shutil \
python311-setuptools"

inherit rpm
