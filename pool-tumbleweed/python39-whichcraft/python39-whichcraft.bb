SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-whichcraft-0.6.1-2.3.noarch.rpm"
RPM_HASH = "3c11df7b3475682b7bc9d2589dbbcae98db5ad491d57c5719f20f2b9182eed5911991209ae513174264373a22d86029b2bcf2ace21f1119060ff4943004ef3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whichcraft \
python39-whichcraft \
python3dist-whichcraft"

RDEPENDS:${PN} += "python-abi"

inherit rpm
