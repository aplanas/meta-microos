SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-utils-3.2.4-1.8.noarch.rpm"
RPM_HASH = "5fe23a7b7c0ad3fc96bcfbbba57326c37405a9a1ca6938a08d7a3cba1c897f140985d866a5571630fbf6056dd5395f268b94796a9c30de4a7164e0637d96b9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql13-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql13-postgis"

inherit rpm
