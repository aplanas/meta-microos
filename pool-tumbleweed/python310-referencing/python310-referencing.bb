SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.30.0"

RPM_NAME = "python310-referencing-0.30.0-1.1.noarch.rpm"
RPM_HASH = "ece796b8c73ce7ac4c71631d4e4b6443cf4619e78fe1c1c2162d22cf7dcab43e1dc32259b3673fb887446061abc45d4c1e1dae3e407e8a0eed73071fa1dff441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-referencing \
python310-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-rpds-py"

inherit rpm
