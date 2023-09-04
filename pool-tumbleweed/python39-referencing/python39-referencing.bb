SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.30.2"

RPM_NAME = "python39-referencing-0.30.2-1.1.noarch.rpm"
RPM_HASH = "e1505b1521ddbcf8958203c9fddbb7cc2a53d5e8c12b6423320dc4489ba34cde2a55d65aeb96313417eb6ed5ab23767734aabc950e0db640f9373dad3dea423c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-referencing \
python39-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-rpds-py"

inherit rpm
