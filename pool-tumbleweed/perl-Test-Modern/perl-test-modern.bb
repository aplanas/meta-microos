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

RPM_NAME = "perl-Test-Modern-0.013-1.12.noarch.rpm"
RPM_HASH = "acee7a8b8af27fbf0222e5ae74e7dca472fc9c294aeca38d7c49e54ae97dda481c792f1706cddaa28c326385274318975cd0f3c1b1f57f8f571b5e38d5cf0c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Modern \
perl-Test-Modern"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
