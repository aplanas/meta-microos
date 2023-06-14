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

RPM_NAME = "perl-Pod-Usage-2.03-1.4.noarch.rpm"
RPM_HASH = "c45c2d53df01963c31789a8947d391acb0ec091b37db3edd51ac19e0938804d2292a594b1b1ba7d7e2e156e6fa1b3eb8102e53e58ccaa84c0169127f78e623d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Usage \
perl-Pod-Usage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-Pod--Perldoc \
perl-Pod--Simple \
perl-Pod--Text"

inherit rpm
