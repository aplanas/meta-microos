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

PV = "3.2.2"

RPM_NAME = "perl-Test-Compile-3.2.2-1.2.noarch.rpm"
RPM_HASH = "e3fb8104ade408ee24ce56ffbff588c076c4d4127a10e23dfa62f6c778db03782c614dac4f51ab65de87734ebea6737555259ce3bb296918578a3644a9d2519b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Compile \
perl-Test--Compile--Internal \
perl-Test-Compile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exporter \
perl-parent"

inherit rpm
