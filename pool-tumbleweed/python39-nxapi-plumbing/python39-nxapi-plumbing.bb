SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python39-nxapi-plumbing-0.5.2-2.1.noarch.rpm"
RPM_HASH = "1ba0b4aa25fc336d812bac07eb51a73423abcf022f1b2c9cdfcae71ddeb1299b560578339533fee9781ba929ff2b0e2c7285f63c388dbf58665ffabb6de17432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nxapi-plumbing \
python39-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-requests \
python39-scp \
python39-six"

inherit rpm
