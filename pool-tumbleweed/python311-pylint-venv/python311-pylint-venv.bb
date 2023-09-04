SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-pylint-venv-3.0.2-1.1.noarch.rpm"
RPM_HASH = "140097d7adc4892a3ca46d3f101a28bebf40d07d144e4b17ae32f71d6dda6b2c309417b20ad5be885a4141385807d7a3940b1213aab8e7031e8935b87e30b4a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-venv \
python3.11dist-pylint-venv \
python311-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
