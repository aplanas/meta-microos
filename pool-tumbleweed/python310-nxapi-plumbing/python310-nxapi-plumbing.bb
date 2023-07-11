SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python310-nxapi-plumbing-0.5.2-1.16.noarch.rpm"
RPM_HASH = "4e6e7e1990fb3719c3b922d6747f40e95756d4c06cf218be37144d5801906a5150a649319377b9b81a0388bd42c903f72539eb0cbd85a84e2816f16aea660ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nxapi-plumbing \
python310-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-lxml \
python310-requests \
python310-scp \
python310-six"

inherit rpm
