SUMMARY = "precision testing for modern perl"
DESCRIPTION = "Test::Modern provides the best features of the Test::More manpage, the \
Test::Fatal manpage, the Test::Warnings manpage, the Test::API manpage, the \
Test::LongString manpage, and the Test::Deep manpage, as well as ideas from \
the Test::Requires manpage, the Test::DescribeMe manpage, the Test::Moose \
manpage, and the Test::CleanNamespaces manpage. \
 \
Test::Modern also automatically imposes the strict manpage and the warnings \
manpage on your script, and loads the IO::File manpage. (Much of the same \
stuff the Modern::Perl manpage does.) \
 \
Although Test::Modern is a modern testing framework, it should run fine on \
pre-modern versions of Perl. It should be easy to install on Perl 5.8.9 and \
above; and if you can persuade its dependencies to install (not necessarily \
easy!), should be OK on anything back to Perl 5.6.1."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Test-Modern-0.013-1.13.noarch.rpm"
RPM_HASH = "bb3b2f2a2cd779fcd0c49823652a71cc4611c0f0628f8deb6f53568efa2a65d07dcd075606bcc195c67691e81bc6e0c44f666b19138333e5894b86b3cc3adb35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Modern \
perl-Test-Modern"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter--Tiny \
perl-Import--Into \
perl-Module--Runtime \
perl-Test--API \
perl-Test--Deep \
perl-Test--Fatal \
perl-Test--More \
perl-Test--Warnings \
perl-Try--Tiny"

inherit rpm
