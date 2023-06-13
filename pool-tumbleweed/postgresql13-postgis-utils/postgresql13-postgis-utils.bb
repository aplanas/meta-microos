SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-utils-3.2.4-1.6.noarch.rpm"
RPM_HASH = "badfcbee4993202dfc7c6f38af981b1bd8011652cde19f7f7984edbb8c2f6cbc5ceb527ff894f3d470d5e1a6ced493d9868d08e83b6424811c922e9ca8f308a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql13-postgis-utils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl-DBD-Pg \
postgresql13-postgis"

inherit rpm
