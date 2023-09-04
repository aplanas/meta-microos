SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql15-postgis-utils-3.3.4-1.2.noarch.rpm"
RPM_HASH = "46b0b45072bdca9fa644e539542fb87409b536f1bf07f9b9891893f89a6c5484e1e910a50caaff599fa7044fc3fd3756033e4d0ea2a29b34a182a5d3118dd35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql15-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql15-postgis"

inherit rpm
