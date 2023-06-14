SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-PyHamcrest-2.0.3-2.1.noarch.rpm"
RPM_HASH = "d65d1793fe475e7ba5e858a2b99d0ed0de5bca827d420d1d4cc8b803a07b7bc57cb860c0f9922ee6e349d1b27a5d8b23946a312899894d756f903fd1ba8ac186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyhamcrest \
python311-PyHamcrest \
python311-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
