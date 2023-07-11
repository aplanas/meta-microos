SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python310-geoip2-4.6.0-4.3.noarch.rpm"
RPM_HASH = "2e34b2f8ece6a6ccc6212d2729177c3a32fc7988f3bf070e9acfc7c18b687222f78ade1effd7b96a68224fe250312a2e49c949d7db4714e01e1a1164e2ce3e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geoip2 \
python310-geoip2 \
python3dist-geoip2"

RDEPENDS:${PN} += "python-abi \
python310-maxminddb \
python310-requests"

inherit rpm
