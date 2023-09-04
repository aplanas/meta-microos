SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql14-postgis-utils-3.3.4-1.1.noarch.rpm"
RPM_HASH = "1a95321db03fdf80c489511aa037762a3896d9dacf8d25213bfe9bf3755b7865056b8b2c89f2adce294aa3a91e1736f15773add8fe39d046354ff52177d99c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql14-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql14-postgis"

inherit rpm
