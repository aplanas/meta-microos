SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python39-pycodestyle-2.10.0-5.3.noarch.rpm"
RPM_HASH = "55ed38b7769c8fc74c06ce3424659e5f58f7cffab55eb0fbe4e7882e17c00cc85e5c450e057bf210811e01f9216090ee94c3790c72ccae345fe3ee8005844e08"
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
