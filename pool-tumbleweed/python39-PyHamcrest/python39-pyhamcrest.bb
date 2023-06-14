SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-PyHamcrest-2.0.3-2.1.noarch.rpm"
RPM_HASH = "a01587a2ff53f1f04f460a9638fe688aab6af076c3e87178f1e86607baa00ad4b9746eea8e7c191b893d3ac19cf1516efec3d0d3505c17a2fbd5688d66cee64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyhamcrest \
python39-PyHamcrest \
python39-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
