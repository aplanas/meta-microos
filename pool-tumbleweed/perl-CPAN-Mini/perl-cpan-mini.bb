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

RPM_NAME = "perl-CPAN-Mini-1.111016-1.28.noarch.rpm"
RPM_HASH = "e68a40446ec08a767c796bdad928f4a486f4af98bbfd07370eb63f4c933da94d186bc06e945b6affe0fc13ec0656366d7f30d09f6b7066b84e109580c37b167c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Mini \
perl-CPAN--Mini--App \
perl-CPAN-Mini"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Compress--Zlib \
perl-File--HomeDir \
perl-File--Path \
perl-LWP--UserAgent \
perl-URI"

inherit rpm
