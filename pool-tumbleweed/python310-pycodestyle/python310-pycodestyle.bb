SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python310-pycodestyle-2.10.0-6.1.noarch.rpm"
RPM_HASH = "5fb9f2dcfa0eda6894e641fae1d56b76d91b6e2b2013e87c2077ce18ccce26db670b0bcb5cb72b1a6730de42dac54b2a0482be3a13916f6971db07b68e28fba1"
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
