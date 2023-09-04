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

RPM_NAME = "perl-CPAN-Changes-0.400002-2.23.noarch.rpm"
RPM_HASH = "6145542461a349453dc4f03e1e930044bc42b4d061e4288787b18567309adda60b16d2f053ca8e1b2f6dc90d48090fed3edbb8411ae0f9b86244f260ef73b1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Changes \
perl-CPAN--Changes--Group \
perl-CPAN--Changes--Release \
perl-CPAN-Changes \
perl-Test--CPAN--Changes"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
