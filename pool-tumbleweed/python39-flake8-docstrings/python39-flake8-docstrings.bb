SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-flake8-docstrings-1.6.0-1.7.noarch.rpm"
RPM_HASH = "8575621cd28d16e9ffbc3a7e5bdf44cf738bc213cd504794f6493ae19768c1c82268948fba4db4d71ee96140d5432fcbdf765e14b76d25d8363a3ac70f3262ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-docstrings \
python39-flake8-docstrings \
python3dist-flake8-docstrings"

RDEPENDS:${PN} += "python-abi \
python39-flake8 \
python39-flake8-polyfill \
python39-pydocstyle"

inherit rpm
