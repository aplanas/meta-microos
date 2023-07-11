SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.7.3"

RPM_NAME = "python39-googlemaps-4.7.3-1.5.noarch.rpm"
RPM_HASH = "d94d7ec3c93b3ce09ca983f1ee372d90c8216f252f9385f6958ad745edec87959413efbc0d825b0823680f835ae1dc4453e2e338f43c97818913b423e17c2e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-googlemaps \
python39-googlemaps \
python3dist-googlemaps"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
