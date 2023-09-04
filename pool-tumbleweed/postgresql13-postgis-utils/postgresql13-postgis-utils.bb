SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql13-postgis-utils-3.3.4-1.2.noarch.rpm"
RPM_HASH = "ad43429362f29b26c81201a02fc46deeb99869788f505c5935c29466109010c68d60de3a7facdcc8dc1f595328a7917838f59c3d349fde84fdbe4137608b2628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql13-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql13-postgis"

inherit rpm
