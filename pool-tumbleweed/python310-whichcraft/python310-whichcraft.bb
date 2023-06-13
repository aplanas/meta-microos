SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-whichcraft-0.6.1-2.1.noarch.rpm"
RPM_HASH = "330720713c453c429df4d2f41e1086fbc80131816ee8585fc833714a2615c0bcd8a2e2d628fb0a42c2aa1caa36f02d849b0cb4ccadb55159a2f8fc99bb47da6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whichcraft \
python3.10dist(whichcraft) \
python310-whichcraft \
python3dist(whichcraft)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
