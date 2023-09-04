SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.11.0"

RPM_NAME = "python39-pycodestyle-2.11.0-1.1.noarch.rpm"
RPM_HASH = "8cc2de66595bd64b1a50c9e9da1b44cfab79ef90d65d2238cdb1624bd22f18be16588edfc825c9a56a8cea86999002a1c25a744b07ac5089d78b723668504e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycodestyle \
python39-pep8 \
python39-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
