SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql12-postgis-utils-3.2.4-1.6.noarch.rpm"
RPM_HASH = "e277e75b709c75ee4e31c691b8cfac9012b8901ee459bce0658ad041ba77143b91fda0872f0b347660080c6135dbeb81338f35b84b63b492603e039c2840dab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql12-postgis-utils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl-DBD-Pg \
postgresql12-postgis"

inherit rpm
