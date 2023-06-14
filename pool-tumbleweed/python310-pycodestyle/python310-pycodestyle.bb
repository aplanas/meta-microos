SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python310-pycodestyle-2.10.0-5.1.noarch.rpm"
RPM_HASH = "fadd6a057681dc6dc98f0d5f4f1b35af23e2bcbe69ff5a76e38884adf4dd24a0054923de0813335a500eb40affe0edbe2cb15b2cf47af7461598a6d645064458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8 \
python3-pycodestyle \
python3.10dist-pycodestyle \
python310-pep8 \
python310-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
