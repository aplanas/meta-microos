SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python311-pycodestyle-2.10.0-5.1.noarch.rpm"
RPM_HASH = "3b72d0a7e9f5bbb19293cf480ccd61f0fda3e81feeb93c64c402bb982d37324c51291b4e55dad910f1d98be80c450791aa59dbf96357c16a3f11cfff3b49e469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pycodestyle \
python311-pep8 \
python311-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
