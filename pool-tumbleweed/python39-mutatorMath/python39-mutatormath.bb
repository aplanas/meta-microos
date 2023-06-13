SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-mutatorMath-3.0.1-4.7.noarch.rpm"
RPM_HASH = "6f1dd78a6c44efb1acdecc3b247d98ab4784f57f53a7ac7d1a5d99a291e59fe05e7030457c8ddc04fbc2d8806192ebebca733c60c69e6a54a34494ffdbbe27d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mutatormath) \
python39-mutatorMath \
python3dist(mutatormath)"

RDEPENDS:${PN} += "python(abi) \
python39-FontTools \
python39-defcon \
python39-fontMath \
python39-fs"

inherit rpm
