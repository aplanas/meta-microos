SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-PyHamcrest-2.0.3-2.1.noarch.rpm"
RPM_HASH = "983c1e48efe42314cd4eca5177081811244cf0aaa38cec01efd3c6db38624fbc8eb6a2167890811042298ad24c04cc7fce024cd93b60e31489724ac2bd360754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyHamcrest \
python3-hamcrest \
python3.10dist-pyhamcrest \
python310-PyHamcrest \
python310-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
