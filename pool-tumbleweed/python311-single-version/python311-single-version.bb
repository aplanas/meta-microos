SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-single-version-1.5.1-1.10.noarch.rpm"
RPM_HASH = "77346cb18b2daf3a73f7173c007e81d66104f79e6488486de5d8edc58a057472cbb149418ffd91900a66410f1b3214396b4733602605255c5e77727973175a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(single-version) \
python311-single-version \
python3dist(single-version)"

RDEPENDS:${PN} += "python(abi) \
python311-first \
python311-importlib-metadata"

inherit rpm
