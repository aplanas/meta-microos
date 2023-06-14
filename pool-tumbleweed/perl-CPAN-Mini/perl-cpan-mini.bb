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

RPM_NAME = "perl-CPAN-Mini-1.111016-1.26.noarch.rpm"
RPM_HASH = "b3f61edf862451ba6c9f0cacb77816dfed404d80d7b278660c5f615f10715d11662b3eab64b3698ac43d373d41cc00d5ef28a661e1969c0c49f3019cb7b3aabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Mini \
perl-CPAN--Mini--App \
perl-CPAN-Mini"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-Compress--Zlib \
perl-File--HomeDir \
perl-File--Path \
perl-LWP--UserAgent \
perl-URI"

inherit rpm
