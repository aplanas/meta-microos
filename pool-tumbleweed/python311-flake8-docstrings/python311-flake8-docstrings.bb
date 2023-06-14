SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-flake8-docstrings-1.6.0-1.6.noarch.rpm"
RPM_HASH = "c7ae21ec1442a5c5980632187cff517362a4f0aeb5b7b02682529dd9eb90ea19f67cb30b14cc4c601e078c6159d8a765c8f777fe65bc0d2d945f76b9a33aee6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8-docstrings \
python311-flake8-docstrings \
python3dist-flake8-docstrings"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-flake8-polyfill \
python311-pydocstyle"

inherit rpm
