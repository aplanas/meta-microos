SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-whichcraft-0.6.1-2.3.noarch.rpm"
RPM_HASH = "bc6e6ffbe9880aaaf98cca3db0be333d17dd35d11fa2cfe4c825001b83eb5d765ba8bbde6fa03ce792763ecac2189baaf59c7b64b100c6283db3c8fb69cb8b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whichcraft \
python310-whichcraft \
python3dist-whichcraft"

RDEPENDS:${PN} += "python-abi"

inherit rpm
