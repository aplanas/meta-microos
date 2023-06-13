SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python311-redfish-3.1.8-1.3.noarch.rpm"
RPM_HASH = "25181b7bbd365cc1252c5a71bf67a26e8db8d30c28f946d5b5ff7d418047af951e4ca00856bba050fd35dd44854188e75e310dcbd163d554a48def767af6cd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(redfish) \
python311-redfish \
python3dist(redfish)"

RDEPENDS:${PN} += "python(abi) \
python311-jsonpatch \
python311-jsonpath-rw \
python311-jsonpointer \
python311-requests \
python311-requests-toolbelt \
python311-requests-unixsocket"

inherit rpm
