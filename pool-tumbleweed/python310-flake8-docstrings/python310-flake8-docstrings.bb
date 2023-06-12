SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-flake8-docstrings-1.6.0-1.6.noarch.rpm"
RPM_HASH = "0c58720610bd00bac8670eeb82e36c2780fc023af5d0edf4053ae89870168745e5fb59b744b49f90036ad26e640cd537fe047bc27d7b12c01b7f1cc03c986be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-docstrings \
python3.10dist(flake8-docstrings) \
python310-flake8-docstrings \
python3dist(flake8-docstrings)"
RDEPENDS:${PN} += "python(abi) \
python310-flake8 \
python310-flake8-polyfill \
python310-pydocstyle"

inherit rpm
