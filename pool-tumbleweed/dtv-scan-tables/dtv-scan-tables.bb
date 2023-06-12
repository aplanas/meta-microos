SUMMARY = "Scan files for digital TV applications v3"
DESCRIPTION = "Scan data needed for some scanning applications from dvb package and maybe \
others. This package contains v3 of the files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "20221125"

RPM_NAME = "dtv-scan-tables-20221125-1.2.noarch.rpm"
RPM_HASH = "de3704dd0d94e8e073bbbd12ce250298d3bfa5c3db9d65bd550add8b2f379a0da47f247864840f838a60dba843a07229363379048849344e7d75049c6033642a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtv-scan-tables"
RDEPENDS:${PN} += ""

inherit rpm
