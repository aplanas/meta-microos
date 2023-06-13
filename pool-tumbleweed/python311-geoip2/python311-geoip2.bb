SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python311-geoip2-4.6.0-3.2.noarch.rpm"
RPM_HASH = "6422488edf9694e3596c94b8509e153c9a36591e7e21ed24e584b5e29680699dadd048ae93fba30ae182fbfd9292205165b1d330c32f0ea396291aed4230545f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geoip2) \
python311-geoip2 \
python3dist(geoip2)"

RDEPENDS:${PN} += "python(abi) \
python311-maxminddb \
python311-requests"

inherit rpm
