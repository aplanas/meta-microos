SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-PyHamcrest-2.0.3-2.3.noarch.rpm"
RPM_HASH = "a959753f369a4a7da44736d8d952c80cc214acdf5775f99433b9b2b0c16b78ff77e8ddd09b5cae76796da10fff0e6f9a6495a6d42d496de4adf8102c748ffb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyHamcrest \
python3-hamcrest \
python3.11dist-pyhamcrest \
python311-PyHamcrest \
python311-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
