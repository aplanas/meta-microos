SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "python310-toposort-1.7-1.14.noarch.rpm"
RPM_HASH = "43a0c15dbf13f4cac2722a6ca3ea3191a6f61e85fe709f3f4d3718924665e7ca98966376665543e358c54afd768e3761ab8011d461b5b3b570e5a807c8b611f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toposort \
python3.10dist-toposort \
python310-toposort \
python3dist-toposort"

RDEPENDS:${PN} += "python-abi"

inherit rpm
