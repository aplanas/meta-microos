SUMMARY = "A library for managing Cisco devices through NX-API using XML or jsonrpc"
DESCRIPTION = "A low-level library for managing Cisco devices through NX-API using JSON-RPC and XML."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python39-nxapi-plumbing-0.5.2-1.14.noarch.rpm"
RPM_HASH = "4662260a7495ab1b585bcdc4d7add6e91225f31293a81ca3c72eb36864fa73aa72dd2ce1599a7581c3d815a01a887072055a7d4f0fb77c39eeb35365d65c27ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nxapi-plumbing) \
python39-nxapi-plumbing \
python3dist(nxapi-plumbing)"

RDEPENDS:${PN} += "python(abi) \
python39-future \
python39-lxml \
python39-requests \
python39-scp \
python39-six"

inherit rpm
