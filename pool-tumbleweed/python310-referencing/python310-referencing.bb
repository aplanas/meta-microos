SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "python310-referencing-0.29.1-1.1.noarch.rpm"
RPM_HASH = "119c14505469a3407dfbacdbf28f77ee8fda4edf9cc8f21d48ec6381522b3ff243a1e22627695b6e40183e88ae43de75fd8dced5286cdf55d69c48ee0297b8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-referencing \
python310-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-rpds-py"

inherit rpm
