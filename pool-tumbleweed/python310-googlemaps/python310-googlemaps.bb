SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.7.3"

RPM_NAME = "python310-googlemaps-4.7.3-1.5.noarch.rpm"
RPM_HASH = "b843f4d0c8687e015efcc04a24a9e00af31146ad96a30998d227c3b0d30eee0c6e53048557c47142a3d8fc091dbfe85b1dc131408ada0b5bc8c29e77f9eee1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-googlemaps \
python310-googlemaps \
python3dist-googlemaps"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
