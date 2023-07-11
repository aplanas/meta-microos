SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-virtualenv-1.7.0-4.3.noarch.rpm"
RPM_HASH = "d6503a23ff75f4d802474c889c9d4cb7c402b821669273c910fb152178eea1d4be1d0b027cb8fc4fac6fc1ca059eed7b666c35af85a41aabd5c6775d695ebfb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-virtualenv \
python310-pytest-virtualenv \
python3dist-pytest-virtualenv"

RDEPENDS:${PN} += "python-abi \
python310-path.py \
python310-pytest-fixture-config \
python310-pytest-shutil \
python310-setuptools"

inherit rpm
