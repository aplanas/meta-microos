SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python311-asdf-coordinates-schemas-0.1.0-1.9.noarch.rpm"
RPM_HASH = "bb64617bfdec0ae001477f789699e9c341603bd7737e2e0ab7bc73aa26b1e8c2f3c4dedfd2403e15dce477413f99e54e4df9558d5b1821231a629e06ae17399c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-coordinates-schemas \
python3.11dist-asdf-coordinates-schemas \
python311-asdf-coordinates-schemas \
python3dist-asdf-coordinates-schemas"

RDEPENDS:${PN} += "python-abi \
python311-asdf"

inherit rpm
