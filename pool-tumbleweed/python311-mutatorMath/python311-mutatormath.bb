SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-mutatorMath-3.0.1-4.7.noarch.rpm"
RPM_HASH = "9dbe53cb79fa94b384e42afdfb005dff66e12af7b605378a2100ef876113ed6bffd3192805911d7b86d625f96d0d8ec7d3c5a9b7e62003bd77d4a18fba9c9854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mutatormath \
python311-mutatorMath \
python3dist-mutatormath"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-defcon \
python311-fontMath \
python311-fs"

inherit rpm
