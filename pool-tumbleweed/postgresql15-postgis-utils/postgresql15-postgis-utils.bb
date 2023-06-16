SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql15-postgis-utils-3.2.4-1.6.noarch.rpm"
RPM_HASH = "97366a3ce156ee79be9d2d6fc0c81f06d7dfd0e000416d064fd61a187e64834b30efe98d43bbf65b6a757d5702f4a062a211d3a2d945683fc299e8bc4b6089af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql15-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql15-postgis"

inherit rpm
