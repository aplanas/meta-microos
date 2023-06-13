SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python39-python-doi-0.2.0-1.3.noarch.rpm"
RPM_HASH = "e3c9763c2ba68a04a415ce15b1fd181e2d06c1f5a9b1b07b2063d5c66bc27c972e05f58f3afd7b1e50e17a15de4ceaa229c13cfd4d9963f34c28e18d14dc0376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-doi) \
python39-python-doi \
python3dist(python-doi)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
