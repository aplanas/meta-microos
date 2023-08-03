SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql11-postgis-utils-3.2.5-1.1.noarch.rpm"
RPM_HASH = "ad68f2c26628c0b3f27a698aaf7e34c96b1b34c9186aca4a9690b98f5cafd614b563a5b4099b72a5383824b7fd36277d96a513e1f4b7d0479db9b7b08a58e65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql11-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql11-postgis"

inherit rpm
