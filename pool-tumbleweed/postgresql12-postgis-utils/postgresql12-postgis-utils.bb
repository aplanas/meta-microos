SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql12-postgis-utils-3.3.4-1.2.noarch.rpm"
RPM_HASH = "c3a908b84d0148d92db351cad7f89128d79f88a64a3698f81ca90079a0e6f51f7a123e43bd4e2f751b1b0df8d27d2c7538a2ffd004303d9140aba23fcf233098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql12-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql12-postgis"

inherit rpm
