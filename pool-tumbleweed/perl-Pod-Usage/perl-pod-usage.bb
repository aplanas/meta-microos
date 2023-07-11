SUMMARY = "Extracts POD documentation and shows usage information"
DESCRIPTION = "*pod2usage* will print a usage message for the invoking script (using its \
embedded pod documentation) and then exit the script with the desired exit \
status. The usage message printed may have any one of three levels of \
'verboseness': If the verbose level is 0, then only a synopsis is printed. \
If the verbose level is 1, then the synopsis is printed along with a \
description (if present) of the command line options and arguments. If the \
verbose level is 2, then the entire manual page is printed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.03"

RPM_NAME = "perl-Pod-Usage-2.03-1.5.noarch.rpm"
RPM_HASH = "12588df8fe998deca336115c4def5d8cadbd7fbe119d2419dfd9f3929b3a5b017753957e141e02ad88ed2ccd4107165a04cf66f680d48f2ae8382798c10a97c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Usage \
perl-Pod-Usage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Perldoc \
perl-Pod--Simple \
perl-Pod--Text"

inherit rpm
