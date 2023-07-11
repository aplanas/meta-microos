SUMMARY = "Dates in the Julian calendar"
DESCRIPTION = "DateTime::Calendar::Julian implements the Julian Calendar. This module \
implements all methods of DateTime; see the DateTime(3) manpage for all \
methods."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.107"

RPM_NAME = "perl-DateTime-Calendar-Julian-0.107-1.8.noarch.rpm"
RPM_HASH = "022d5926ed32e1c759b04cbf75af1f136ad43fcd735c46acd583a848dda31743d65fed82320ca167dc64fbd3fc839d102235911237091f383c2a0d0e23fcc847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Calendar--Julian \
perl-DateTime-Calendar-Julian"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime"

inherit rpm
