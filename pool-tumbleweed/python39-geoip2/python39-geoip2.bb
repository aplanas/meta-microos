SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python39-geoip2-4.6.0-4.3.noarch.rpm"
RPM_HASH = "086305eafe1a67369d22f316ed623fceb85877ed7c7c055e5576dd65a7522e6bed3f80979ec7496366fc8c31eafad5341558d7c12a324fa15823e669002e42b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geoip2 \
python39-geoip2 \
python3dist-geoip2"

RDEPENDS:${PN} += "python-abi \
python39-maxminddb \
python39-requests"

inherit rpm
