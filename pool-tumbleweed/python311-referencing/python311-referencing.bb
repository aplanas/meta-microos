SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.0"

RPM_NAME = "python311-referencing-0.29.0-1.3.noarch.rpm"
RPM_HASH = "4bc4096de0276a04fff6bed7d8991b78a2c1c2784ac560b949c27f013c39f6b54df95e30bbf260e1ee5e5bc7c2fbfb017e6bee86d170a1ea8baddb9005c12870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing \
python3.11dist-referencing \
python311-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-rpds-py"

inherit rpm
