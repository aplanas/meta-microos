SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python39-nxapi-plumbing-0.5.2-1.16.noarch.rpm"
RPM_HASH = "07e169e08a16af046d3097cf5d1df8a82734d06dac6b34551684f6c4e4153152dff072c3dfd3dcc3ad0a97828912b100eb33a96ebc575a899fa751dc3ee2f3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nxapi-plumbing \
python39-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-lxml \
python39-requests \
python39-scp \
python39-six"

inherit rpm
