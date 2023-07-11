SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python311-nxapi-plumbing-0.5.2-1.16.noarch.rpm"
RPM_HASH = "45cda894b0c37faa39ff46ec38c4c49ad8c2b0bd2e6d026d55c178eef41ecda85a552ff9134e8ebdbee5caae1bb96f309a320f751e5614ff73543ce3c0da8661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nxapi-plumbing \
python3.11dist-nxapi-plumbing \
python311-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-lxml \
python311-requests \
python311-scp \
python311-six"

inherit rpm
