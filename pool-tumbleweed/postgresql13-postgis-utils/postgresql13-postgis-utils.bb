SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql13-postgis-utils-3.2.5-1.1.noarch.rpm"
RPM_HASH = "6df2c482be2e6f84a7081fafbbaf40c74692f2fea4e194acdd57fedc629e82e6858473fb69ce71bbc5a5f09d0640fddf5c7ae90f9d662d929c1995a53d5ba334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql13-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql13-postgis"

inherit rpm
