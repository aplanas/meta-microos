SUMMARY = "Read the CDDB entry for an audio CD in your drive"
DESCRIPTION = "This module/script gets the CDDB info for an audio cd. You need LINUX, \
SUNOS or *BSD, a cdrom drive and an active internet connection in order to \
do that."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.28"

RPM_NAME = "perl-CDDB_get-2.28-1.27.noarch.rpm"
RPM_HASH = "ace06bc671d8a34602755c870bb9137a4c468cf22709f85692589d798d806da9c07930a456c8df20192cee943fb1491b8cfbe8190d8bdb03941afcb3bb8d3777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CDDB-cache \
perl-CDDB-get"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
