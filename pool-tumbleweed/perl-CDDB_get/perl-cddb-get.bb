SUMMARY = "Read the CDDB entry for an audio CD in your drive"
DESCRIPTION = "This module/script gets the CDDB info for an audio cd. You need LINUX, \
SUNOS or *BSD, a cdrom drive and an active internet connection in order to \
do that."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.28"

RPM_NAME = "perl-CDDB_get-2.28-1.28.noarch.rpm"
RPM_HASH = "cd49f90665aaa6494a1fa9cb41c6b8f4cda3e62af930497a5483e2815dbcc2e5889a26a368f52d3d97fe7dc7593820b652a06b05ce7f42928b4a0b5e0dea22b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CDDB-cache \
perl-CDDB-get"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
