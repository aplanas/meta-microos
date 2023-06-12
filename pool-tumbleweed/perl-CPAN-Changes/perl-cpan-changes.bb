SUMMARY = "Read and write Changes files"
DESCRIPTION = "It is standard practice to include a Changes file in your distribution. The \
purpose the Changes file is to help a user figure out what has changed \
since the last release. \
 \
People have devised many ways to write the Changes file. A preliminary \
specification has been created (the CPAN::Changes::Spec manpage) to \
encourage module authors to write clear and concise Changes. \
 \
This module will help users programmatically read and write Changes files \
that conform to the specification."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.400002"

RPM_NAME = "perl-CPAN-Changes-0.400002-2.21.noarch.rpm"
RPM_HASH = "ef237470c85c53ae745e2eb70985f892b8c143dd9a342182e865bfc1a47fbe557c71ab1d155c202c975305d1d6bfb8b406b26c1519fafe9ec42ca322adbda767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Changes) \
perl(CPAN::Changes::Group) \
perl(CPAN::Changes::Release) \
perl(Test::CPAN::Changes) \
perl-CPAN-Changes"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
