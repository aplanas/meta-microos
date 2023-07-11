SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python311-redfish-3.1.8-1.5.noarch.rpm"
RPM_HASH = "f5081f8beec23745e9692bdd88f78b64a41bc485411e6b1449fe9a891e606005882f8c5958613544e0c5b5124c90d64f879c26528ae6af47765c992feead6555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redfish \
python3.11dist-redfish \
python311-redfish \
python3dist-redfish"

RDEPENDS:${PN} += "python-abi \
python311-jsonpatch \
python311-jsonpath-rw \
python311-jsonpointer \
python311-requests \
python311-requests-toolbelt \
python311-requests-unixsocket"

inherit rpm
