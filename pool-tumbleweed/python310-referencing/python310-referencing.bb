SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.0"

RPM_NAME = "python310-referencing-0.29.0-1.1.noarch.rpm"
RPM_HASH = "d0336404d8a111c17306e588fbc0ef54a7d1c91b5a74b2ca6bf8c519d19abe672d8abb3cd470e2445e2257a213cb843b08727813b84151f45146bef04c73260a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing \
python3.10dist-referencing \
python310-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-rpds-py"

inherit rpm
