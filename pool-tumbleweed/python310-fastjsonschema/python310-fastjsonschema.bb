SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.17.1"

RPM_NAME = "python310-fastjsonschema-2.17.1-1.3.noarch.rpm"
RPM_HASH = "1215345fc267bc9914d786b7fc806d5d205a996fdd4038ca684d6d4e878d282919535e0edd5e44698bb88d561bed0e9a9ee139f3d1dc1ab092c567d9b19b205d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fastjsonschema \
python310-fastjsonschema \
python3dist-fastjsonschema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
