SUMMARY = "Create a Minimal Mirror of Cpan"
DESCRIPTION = "CPAN::Mini provides a simple mechanism to build and update a minimal mirror \
of the CPAN on your local disk. It contains only those files needed to \
install the newest version of every distribution. Those files are: \
 \
* * \
 \
  01mailrc.txt.gz \
 \
* * \
 \
  02packages.details.txt.gz \
 \
* * \
 \
  03modlist.data.gz \
 \
* * \
 \
  the last non-developer release of every dist for every author"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.111016"

RPM_NAME = "perl-CPAN-Mini-1.111016-1.27.noarch.rpm"
RPM_HASH = "f8427a830d7079c436e8516dc630e29ef330e4ae5c6ebeff80cd747c64907ae71be435226c556beb9d0eb5f92bf5b443644913bc17feedb598e1e5cd6e43f381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Mini \
perl-CPAN--Mini--App \
perl-CPAN-Mini"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Compress--Zlib \
perl-File--HomeDir \
perl-File--Path \
perl-LWP--UserAgent \
perl-URI"

inherit rpm
