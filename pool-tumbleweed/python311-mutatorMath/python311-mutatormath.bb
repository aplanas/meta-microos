SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-mutatorMath-3.0.1-4.9.noarch.rpm"
RPM_HASH = "bdb47d3fa180978d3b3cd181a796745b2bd96410a5d3e9c6c48aeb72bee8ec99b1d10910eadc4c1dda1d03134431925afe0fed585859ff0dea230b56991e19b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutatorMath \
python3.11dist-mutatormath \
python311-mutatorMath \
python3dist-mutatormath"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-defcon \
python311-fontMath \
python311-fs"

inherit rpm
