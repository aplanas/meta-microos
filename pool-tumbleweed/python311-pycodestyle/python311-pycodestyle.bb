SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python311-pycodestyle-2.10.0-6.1.noarch.rpm"
RPM_HASH = "ed9927652e0e24df7b7bf445aeb367ae94b0ae12d191dddfc9516cf11a9329a135d17e771d39f0911f11d25a1219a5ab9c69d76e9b7962624ed03151719d7323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8 \
python3-pycodestyle \
python3.11dist-pycodestyle \
python311-pep8 \
python311-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
