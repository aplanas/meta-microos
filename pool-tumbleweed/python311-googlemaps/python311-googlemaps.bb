SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.7.3"

RPM_NAME = "python311-googlemaps-4.7.3-1.5.noarch.rpm"
RPM_HASH = "6e9f18a047726340c7e8448f67240ccc6a8f454039fa61042ca422df4de4e8c158c12c4d08997752335174dc0f841dacffea742441d4b8f5fab33b3b73309ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googlemaps \
python3.11dist-googlemaps \
python311-googlemaps \
python3dist-googlemaps"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
