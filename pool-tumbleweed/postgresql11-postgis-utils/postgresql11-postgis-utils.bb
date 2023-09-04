SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql11-postgis-utils-3.3.4-1.2.noarch.rpm"
RPM_HASH = "72aabc0c72890ddfd108836c28bb706881176ea82120952cacec030097c8f1749c66591cb9d2f7c0589332134bf90cbd0037da6562cb3ea85e8af459eba57b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql11-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql11-postgis"

inherit rpm
