SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql12-postgis-utils-3.2.4-1.8.noarch.rpm"
RPM_HASH = "a8ed48f3357055dc4ae54745e0a0ec999911ddbbd53003d68e0a9a81bc6994c53e78adab11a8961855e0652805b49cd52aa3b55383aed6aeabd397614744c962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql12-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql12-postgis"

inherit rpm
