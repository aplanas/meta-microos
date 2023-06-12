SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.7.3"

RPM_NAME = "python39-googlemaps-4.7.3-1.3.noarch.rpm"
RPM_HASH = "dff6cec85433738f2eef3a1f6c05752c93e44ee16a26d59818a4af24682d0ac56fa83e43bbb6a21914182484a63d19a57be428ef00734de30611a6f284ca5f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(googlemaps) \
python39-googlemaps \
python3dist(googlemaps)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
