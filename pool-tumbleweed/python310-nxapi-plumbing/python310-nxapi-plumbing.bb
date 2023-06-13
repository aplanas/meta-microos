SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python310-nxapi-plumbing-0.5.2-1.14.noarch.rpm"
RPM_HASH = "7700a72e827514ee478f4c5a58c839db36c3113863611bb11c7d30e51af81ed88b7dcdbae74892ca401a02965ee76a3ab3daada06fa3127648f71359c2c80563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nxapi-plumbing \
python3.10dist(nxapi-plumbing) \
python310-nxapi-plumbing \
python3dist(nxapi-plumbing)"

RDEPENDS:${PN} += "python(abi) \
python310-future \
python310-lxml \
python310-requests \
python310-scp \
python310-six"

inherit rpm
