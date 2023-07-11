SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python310-pycodestyle-2.10.0-5.3.noarch.rpm"
RPM_HASH = "566927bcb8672908dbaee6b542e239a7eb78d8c8a9b410f5b700ca6a46c609c4eebf51622e20b569d8c12478ce6f67b9966be4c89e431bd84ca54ff90e47b40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pycodestyle \
python310-pep8 \
python310-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
