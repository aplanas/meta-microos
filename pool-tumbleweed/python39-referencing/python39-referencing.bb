SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.0"

RPM_NAME = "python39-referencing-0.29.0-1.1.noarch.rpm"
RPM_HASH = "71517d3ff34e0498834c2e2285b27bf015469fa18628cdb66cf0d2a6194d2081f4a0cc01e3bf8c143bf1ded17df9f0be7a8f162ecf4c5974aaa372d31d1ac533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(referencing) \
python39-referencing \
python3dist(referencing)"

RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-rpds-py"

inherit rpm
