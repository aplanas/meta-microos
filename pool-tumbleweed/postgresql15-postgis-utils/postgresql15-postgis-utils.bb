SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql15-postgis-utils-3.2.4-1.8.noarch.rpm"
RPM_HASH = "2ecc847401d5e11645075579183fadd6eb2714d0af29f6a0e101db09d20dc466beb9a09a0a25883b9392a8d571cc5d3c411500a90e9684aa2cb7c3a5aa1be512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql15-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql15-postgis"

inherit rpm
