SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.0"

RPM_NAME = "python310-referencing-0.29.0-1.3.noarch.rpm"
RPM_HASH = "de6e06d72f049667cec10f4cb5ca6076f4a44109095b3502ba4848e0dedc26d29ac9df4e9c540f20e7a34abaf6f2b18e9c0c023437b167f0ec5f7ce8c69bfd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-referencing \
python310-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-rpds-py"

inherit rpm
