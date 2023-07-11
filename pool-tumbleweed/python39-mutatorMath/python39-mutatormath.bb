SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-mutatorMath-3.0.1-4.9.noarch.rpm"
RPM_HASH = "4bbd6d50f6de21b6452377c53941844bb214a7c243c8a73557b9c30a79546b101ff0e1e197829ea46f376f7e1067a64ce817f282352b22aaf7d76af4edd453ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mutatormath \
python39-mutatorMath \
python3dist-mutatormath"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-defcon \
python39-fontMath \
python39-fs"

inherit rpm
