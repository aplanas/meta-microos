SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "python39-referencing-0.29.1-1.1.noarch.rpm"
RPM_HASH = "899391786ad635d5b773e490bff28ca3c5c44251298616794592fc539316e296805bc555a244e18caa753409fd969834dec21c7e26fdb56b07b225800882ef74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-referencing \
python39-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-rpds-py"

inherit rpm
