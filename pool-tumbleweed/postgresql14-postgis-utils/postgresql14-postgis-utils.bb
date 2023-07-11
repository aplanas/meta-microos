SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql14-postgis-utils-3.2.4-1.8.noarch.rpm"
RPM_HASH = "c675a48c0a9116b460b9831d674ab4ef92de86e8cbc35dc66000659036289db2edb3a81b33a261a27565983bf6a7fe39afc1ad2c7ac4ebaf8eb4af9576a54d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql14-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql14-postgis"

inherit rpm
