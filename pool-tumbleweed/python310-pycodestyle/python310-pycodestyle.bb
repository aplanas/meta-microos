SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.11.0"

RPM_NAME = "python310-pycodestyle-2.11.0-1.1.noarch.rpm"
RPM_HASH = "5df8f222e9b5ee1d478ed96211bc5da8738ca564fa976722de4f564f42ed892a5d14abb77c3f4e2d1440910d5da491b15b0daeaf8769130a485de7d502986f84"
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
