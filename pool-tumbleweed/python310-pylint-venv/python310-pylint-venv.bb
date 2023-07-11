SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-pylint-venv-2.3.0-1.5.noarch.rpm"
RPM_HASH = "0efeee4e8258d890a7304f48468798d87f587c48a164542c88f7241fc9f5c089e3e9669b05450301ddbd3d7e3b6f268afdc64cba76d3d46a87b1dd2bd762ed65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylint-venv \
python310-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
