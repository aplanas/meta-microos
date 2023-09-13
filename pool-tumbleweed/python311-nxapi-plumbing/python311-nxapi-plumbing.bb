SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python311-nxapi-plumbing-0.5.2-2.1.noarch.rpm"
RPM_HASH = "566dd50ea6c443e33eb9cb0e97322cd91708de48702038e763a57db11fc328f287b25106c80a81f5fde620913b7f0ee50b2bf3c0babcc48699c9a0d0cf3fc3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nxapi-plumbing \
python3.11dist-nxapi-plumbing \
python311-nxapi-plumbing \
python3dist-nxapi-plumbing"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-requests \
python311-scp \
python311-six"

inherit rpm
