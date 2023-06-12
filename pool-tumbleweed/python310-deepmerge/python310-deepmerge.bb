SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-deepmerge-1.1.0-1.1.noarch.rpm"
RPM_HASH = "3868804984fd72abb383ba8c986772d5bd28a5ce118b20144e43931490e5ca6ef14c438b226f86495e965dbbfe4c847d0fd5a9c91c154f5527ac0a7dc221bd28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepmerge \
python3.10dist(deepmerge) \
python310-deepmerge \
python3dist(deepmerge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
