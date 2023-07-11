SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-PyHamcrest-2.0.3-2.3.noarch.rpm"
RPM_HASH = "d827c8e49e67363d53feec996d35643e5a29b29c9e955d139bead12a2c126189784e678abaa7bd8efce4c88c8ae40aa193757161e412f8701e79a0eb3fb23618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyhamcrest \
python310-PyHamcrest \
python310-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
