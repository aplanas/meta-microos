SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-pylint-venv-2.3.0-1.5.noarch.rpm"
RPM_HASH = "53b2ab63af1d098763c489a52b772b4d92d6c13bb76e0c31413b8a0e700b1a939e0356c91df5cc9d5a576805470c55427bb5caf65a4cee18afd7cc74e480bc0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-venv \
python3.11dist-pylint-venv \
python311-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
