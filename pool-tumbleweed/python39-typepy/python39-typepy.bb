SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-typepy-1.3.0-2.8.noarch.rpm"
RPM_HASH = "087f799e1eacf72ec366200f12007ddb57b3a589bb174b7f9cd7f3bea349292d3ee3fbe8cc1e93f48b01b2e0a120dcf737a8e3ce2eb7df753c4f891b50c6fe4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typepy \
python39-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python39-mbstrdecoder"

inherit rpm
