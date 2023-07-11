SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python39-redfish-3.1.8-1.5.noarch.rpm"
RPM_HASH = "81ecd2af4f9c079ef106a1d4ca6eb1199fe82dc497d28dc78c78b5e94c4183b8180f0e9f00cf39bc4b8fbe4c7286e1c0bc51d78582096b8fe40b23b0f698168f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-redfish \
python39-redfish \
python3dist-redfish"

RDEPENDS:${PN} += "python-abi \
python39-jsonpatch \
python39-jsonpath-rw \
python39-jsonpointer \
python39-requests \
python39-requests-toolbelt \
python39-requests-unixsocket"

inherit rpm
