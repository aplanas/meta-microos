SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python310-easypysmb-1.4.4-1.12.noarch.rpm"
RPM_HASH = "642b95db0901bf40e3a0d6865493d1a6627554360e89e9f6a41b41811fed5db52b3c54bdf0169182af44cd8b569de84459cce607dbb0c35499d5cec3e525a715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easypysmb \
python3.10dist(easypysmb) \
python310-easypysmb \
python3dist(easypysmb)"

RDEPENDS:${PN} += "python(abi) \
python310-pysmb"

inherit rpm
