SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-flake8-docstrings-1.6.0-1.7.noarch.rpm"
RPM_HASH = "70f23272d5b63ec56e2aac7869c34da7bd90a7b8371640efa5faa460d2444be718390f9202fba9336f29d186c3688aca0c1a5ac668f08fbc1d3def93923c0b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-docstrings \
python3.11dist-flake8-docstrings \
python311-flake8-docstrings \
python3dist-flake8-docstrings"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-flake8-polyfill \
python311-pydocstyle"

inherit rpm
