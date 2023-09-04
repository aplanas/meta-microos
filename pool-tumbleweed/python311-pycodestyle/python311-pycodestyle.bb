SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.11.0"

RPM_NAME = "python311-pycodestyle-2.11.0-1.1.noarch.rpm"
RPM_HASH = "4323b92a584de5366b84ee76dbc80b63c3ba6b5a0fc76a37bd17f0862de026db16c56b097b543189667f6f9c8c07be4d9a18538af43e3eda87a9b3fc3cbf2392"
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
