SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-deepmerge-1.1.0-1.3.noarch.rpm"
RPM_HASH = "490536f284fed4e103b04ffd168ac6eabd69c15dc8e9515de0e2bd69a4b8ab8ba9ffe1e36fcd347ba885fc77d8f447f99953f183606b1e9d72ce07ff85d35aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-deepmerge \
python310-deepmerge \
python3dist-deepmerge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
