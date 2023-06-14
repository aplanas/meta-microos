SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python39-redfish-3.1.8-1.3.noarch.rpm"
RPM_HASH = "111d4e194a023d4dfa93dd1090cedf5c26d2dee208c29ab382cf9254fa8551df2dd91191d38bdb4e6d19f7c591f9a959cb6a1648f804612fbbfbadf1a7202508"
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
