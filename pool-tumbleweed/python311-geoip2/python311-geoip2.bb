SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python311-geoip2-4.6.0-4.3.noarch.rpm"
RPM_HASH = "39f320d0ed1c00f4f6a40e1583053db78f62775aed2448ede120da6269d127ef845878fe9ccf094ec9eb317a767a2183194f47bbc91ff8bf40362bdb9ba64e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geoip2 \
python3.11dist-geoip2 \
python311-geoip2 \
python3dist-geoip2"

RDEPENDS:${PN} += "python-abi \
python311-maxminddb \
python311-requests"

inherit rpm
