SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql14-postgis-utils-3.2.5-1.1.noarch.rpm"
RPM_HASH = "55da5a8a8cf2b362a63de19733b90386c2acc4535e906d314c5dbbbcf479d7fb448eb84ca1bd541b2eab8dd88cc91cdfcf95bba438ae27900ebc74beef6445a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql14-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql14-postgis"

inherit rpm
