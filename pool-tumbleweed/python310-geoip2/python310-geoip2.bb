SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python310-geoip2-4.6.0-3.2.noarch.rpm"
RPM_HASH = "1fec1347084a34f153b7b494cc47609da897bdecc861641c245cbaf58a215f2d5aceea75c6d427891bbf79514b917a4fbf11b3ecfecf975a515a0b7fdfc8b7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geoip2 \
python3.10dist-geoip2 \
python310-geoip2 \
python3dist-geoip2"

RDEPENDS:${PN} += "python-abi \
python310-maxminddb \
python310-requests"

inherit rpm
