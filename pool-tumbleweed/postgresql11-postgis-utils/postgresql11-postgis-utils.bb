SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql11-postgis-utils-3.2.4-1.8.noarch.rpm"
RPM_HASH = "733d5ff494473c8d5a710d0e853056b447a03f21f4455b6fc6759bb05275d1b60824932dbffae3a8abdc402e4aa28bf7c6337dbbf321dd34d5897eac430c861f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql11-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql11-postgis"

inherit rpm
