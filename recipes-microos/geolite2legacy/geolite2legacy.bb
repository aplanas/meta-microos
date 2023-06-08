SUMMARY = "GeoLite2 (CSV) to Legacy format converter"
DESCRIPTION = "Script to convert the GeoLite2 CSV database to Legacy GeoIP \
format. Note that GeoIP is deprecated by upstream and should be \
replaced by GeoLite2."
LICENSE = "MIT"

PV = "0+git20210326.05733c4"

RPM_NAME = "geolite2legacy-0+git20210326.05733c4-1.2.noarch.rpm"
RPM_HASH = "d5ab134c1d20301bae6178ba1f3bc071b8524d4a6ad93a6387c025e12fe2a1936d2b99e76211bae23c500f34b4ffab867dbc75c21d0a868b825736a7fc4a5c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geolite2legacy"
RDEPENDS:${PN} += "/usr/bin/python3 python3-ipaddr"

inherit rpm
