SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python39-pycodestyle-2.10.0-6.1.noarch.rpm"
RPM_HASH = "70df75f46e141bf5379cb4c51e0655114705c67eefe6e9451f35ce3e7a2673a6de523031ddb66b85e1e29e0d248d66f36a7820e5b774ef45cb8c8fef685b1ed7"
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
