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

RPM_NAME = "perl-Pod-Usage-2.03-1.6.noarch.rpm"
RPM_HASH = "20b05367dd5a7899881257e83835fcc6c1ca5ee2a6c3f5dd3c0c6a204c57acf048489a42d3ca033b3d404934a798c58ee84eb570f66b77791c73ce838088d943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Usage \
perl-Pod-Usage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Pod--Perldoc \
perl-Pod--Simple \
perl-Pod--Text"

inherit rpm
