SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-mutatorMath-3.0.1-4.9.noarch.rpm"
RPM_HASH = "6279184406018463a383fb825782fe365d915330d65205fe5dd978a7ec2815d777a81c49c1b6ed0819a489da5af8b95eb57bbdbf889850d039497c05d259b547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mutatormath \
python310-mutatorMath \
python3dist-mutatormath"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-defcon \
python310-fontMath \
python310-fs"

inherit rpm
