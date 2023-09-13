SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python310-nxapi-plumbing-0.5.2-2.1.noarch.rpm"
RPM_HASH = "8b29ba90f46d4aaeecda7104cc324cc72bc9a2522feb4cd76b5030fd05422bd0356940bb02b5db2214ccf719e7fc16930ce9767dfecb68756cbb21bfcd9e3ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nxapi-plumbing \
python310-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-requests \
python310-scp \
python310-six"

inherit rpm
