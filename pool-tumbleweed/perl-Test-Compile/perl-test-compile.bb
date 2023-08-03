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

RPM_NAME = "perl-Test-Compile-3.3.1-1.1.noarch.rpm"
RPM_HASH = "d282ca7d1ef857a2d9d00f7ee5fd6973a20b1e72edbb56440112babdee0a5ed1f7fc60a2b21057ebff771331b451d1f59b0d20ac4cc82480324a893f7e51ed00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Compile \
perl-Test--Compile--Internal \
perl-Test-Compile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exporter \
perl-parent"

inherit rpm
