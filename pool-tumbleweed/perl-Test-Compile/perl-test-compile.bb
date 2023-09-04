SUMMARY = "Assert that your Perl files compile OK"
DESCRIPTION = "'Test::Compile' lets you check the whether your perl modules and scripts \
compile properly, results are reported in standard 'Test::Simple' fashion. \
 \
The basic usage - as shown above, will locate your perl files and test that \
they all compile. \
 \
Module authors can (and probably should) include the following in a \
_t/00-compile.t_ file and have 'Test::Compile' automatically find and check \
all Perl files in a module distribution: \
 \
     \
    use strict; \
    use warnings; \
    use Test::Compile qw(); \
 \
    my $test = Test::Compile->new(); \
    $test->all_files_ok(); \
    $test->done_testing();"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.3.1"

RPM_NAME = "perl-Test-Compile-3.3.1-1.2.noarch.rpm"
RPM_HASH = "93af13dffbe0618ac4b9a9dcc354bf52f1173549248bcef2145f14060efd05398d4fe3f3a9b63763202506b02d80de28336db0095db8da5841cbd833ef76a9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Compile \
perl-Test--Compile--Internal \
perl-Test-Compile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter \
perl-parent"

inherit rpm
