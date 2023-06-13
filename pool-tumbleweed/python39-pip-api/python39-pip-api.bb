SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python39-pip-api-0.0.30-2.1.noarch.rpm"
RPM_HASH = "5474edab94ccb9b7118f174659520ca2078d6a813932f3d6fdb43415640c462aabf9a9d86c08e4df6dd1b735a0e0a8b8549a90732b33726b781c5162d95c31cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip-api) \
python39-pip-api \
python3dist(pip-api)"

RDEPENDS:${PN} += "python(abi) \
python39-pip"

inherit rpm
