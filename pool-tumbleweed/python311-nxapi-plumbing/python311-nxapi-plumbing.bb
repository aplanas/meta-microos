SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python311-nxapi-plumbing-0.5.2-1.14.noarch.rpm"
RPM_HASH = "c92cd42b092b444023c7fbac6eab6545e93e09ed4aeed03099731b5b5bd921851b7b67d90b8a2b8bdca295c8f227d19ad8f7735d7bce5a960b302d81e0662b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nxapi-plumbing \
python311-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-lxml \
python311-requests \
python311-scp \
python311-six"

inherit rpm
