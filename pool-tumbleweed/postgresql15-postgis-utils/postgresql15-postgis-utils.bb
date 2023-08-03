SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql15-postgis-utils-3.2.5-1.1.noarch.rpm"
RPM_HASH = "b393d5f2d46e846cfecbfe36c3894358ce3652d952fd54725752d5c5cf727a9e7bdac162f7720aa3c6f3d0f3c9b692d3b41d712a609df310cc0a9b966ac74ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql15-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql15-postgis"

inherit rpm
