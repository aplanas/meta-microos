SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python39-jaraco.path-3.5.0-1.1.noarch.rpm"
RPM_HASH = "01db1f215f67d20279158eadbb9d8463f8d3cb19264b8b1ec687a385d5f07840aad602762a29c20160d00143e91990c580d18a05ad47359e67696682e4fa16dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.path \
python39-jaraco.path \
python3dist-jaraco.path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
