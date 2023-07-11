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

RPM_NAME = "perl-CPAN-Changes-0.400002-2.22.noarch.rpm"
RPM_HASH = "0b11ef2abc88a8575beb420a72922ecebb3835411cd080f836346219e2ca467173f623314e6fffc9f902600c65e01ff34ccefa984d15e562c0638b391316f51c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Changes \
perl-CPAN--Changes--Group \
perl-CPAN--Changes--Release \
perl-CPAN-Changes \
perl-Test--CPAN--Changes"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
