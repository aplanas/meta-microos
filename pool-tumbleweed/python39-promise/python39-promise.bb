SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-promise-2.3.0-5.1.noarch.rpm"
RPM_HASH = "108b5751ac17b02ba3db50b24502d6b4aa3c20f2a61cc695cea1075e17983afb726bd6f4baf7a13a4da77ed5b27cbff7a67241812f55e0e39b10ce76b9b004e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-promise \
python39-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
