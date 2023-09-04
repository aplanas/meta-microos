SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.30.2"

RPM_NAME = "python310-referencing-0.30.2-1.1.noarch.rpm"
RPM_HASH = "5aeec1340b626606e9723b50db2774a913f90260b1d599fab992409a4b6ac67919946aed6a0581f9e7fd223122948299f9150b12ed0ee420881b9f4caac0e2c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-referencing \
python310-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-rpds-py"

inherit rpm
