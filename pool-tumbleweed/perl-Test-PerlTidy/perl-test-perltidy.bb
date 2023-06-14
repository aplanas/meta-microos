SUMMARY = "Check that all your files are tidy"
DESCRIPTION = "This test submodule runs perltidy on files and reports errors if any \
of the files differ after having been tidied. It does not permanently \
modify the files being tested. \
 \
By default, perltidy will be run on files under the current directory \
and its subdirectories with extensions matching: .pm .pl .PL .t."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20230226"

RPM_NAME = "perl-Test-PerlTidy-20230226-1.1.noarch.rpm"
RPM_HASH = "1acb1c2b1c31b70058abcc13d00e9476e99fa563680903a6d1a6cec50a9b5b3871449a7d3c2d1f799d604bb0ab5f2cbd241eba48e71cd01fcf96ce64d6d3e3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--PerlTidy \
perl-Test-PerlTidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Path--Tiny \
perl-Perl--Tidy \
perl-Text--Diff \
perl-parent"

inherit rpm
