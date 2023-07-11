SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-virtualenv-1.7.0-4.3.noarch.rpm"
RPM_HASH = "0766bb4b956deacb612b621e871d14f6521faf99bfc99e893619ae121c9c1548ea586e041ff11072f9b055400e21fbba04608877cfbab2dd584d09b9588a091d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-virtualenv \
python3.11dist-pytest-virtualenv \
python311-pytest-virtualenv \
python3dist-pytest-virtualenv"

RDEPENDS:${PN} += "python-abi \
python311-path.py \
python311-pytest-fixture-config \
python311-pytest-shutil \
python311-setuptools"

inherit rpm
