SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-whichcraft-0.6.1-2.3.noarch.rpm"
RPM_HASH = "371e7f6f7475e21dde2ae6b11bcf4b1a09c0bfdfa39d3f9d15ffe13e9c626491d1f68f95566ba56b365ba29d0d4e9278ad765ce67dc572a9c7aba4cdd826569e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whichcraft \
python3.11dist-whichcraft \
python311-whichcraft \
python3dist-whichcraft"

RDEPENDS:${PN} += "python-abi"

inherit rpm
