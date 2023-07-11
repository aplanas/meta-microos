SUMMARY = "Documentation files for praatio"
DESCRIPTION = "HTML Documentation and examples for praatio."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python-praatio-doc-4.1.0-1.14.noarch.rpm"
RPM_HASH = "8c7e7bc7eb68afe3a39fa50141912086949ecc06a7ae5867ebd02593fbe944fd28f469f01922256d2ed454326b3781c1368a80be93058ed6493a218a1d224ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-praatio-doc \
python310-praatio-doc \
python311-praatio-doc \
python39-praatio-doc"

RDEPENDS:${PN} += ""

inherit rpm
