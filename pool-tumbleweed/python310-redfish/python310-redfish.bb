SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python310-redfish-3.1.8-1.5.noarch.rpm"
RPM_HASH = "c0cfbdcb782cd89fbc40dfc057411e00e2953fd8989f81d6100e1dd01cbeb28873d7a9e6ddbbbeef07c0a960d929b554252d6c6a579a4646b7b496f90883a5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-redfish \
python310-redfish \
python3dist-redfish"

RDEPENDS:${PN} += "python-abi \
python310-jsonpatch \
python310-jsonpath-rw \
python310-jsonpointer \
python310-requests \
python310-requests-toolbelt \
python310-requests-unixsocket"

inherit rpm
