SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql12-postgis-utils-3.2.5-1.1.noarch.rpm"
RPM_HASH = "473a0f4b61b820e6b3f81ac225ede233986d8ebf76e60f3027401085eee18cc17bef4759ebcf1c83994c8c6284b5b0f78269e2c9057c7fa49bb0ea948a610810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql12-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql12-postgis"

inherit rpm
