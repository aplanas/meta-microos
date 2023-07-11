SUMMARY = "Check that all your files are tidy"
DESCRIPTION = "This test submodule runs perltidy on files and reports errors if any \
of the files differ after having been tidied. It does not permanently \
modify the files being tested. \
 \
By default, perltidy will be run on files under the current directory \
and its subdirectories with extensions matching: .pm .pl .PL .t."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20230226"

RPM_NAME = "perl-Test-PerlTidy-20230226-1.2.noarch.rpm"
RPM_HASH = "f43d00f4f9cecfcf88097e9d8adcab4291fc2dc8a96d210d93718b3d63fab5d54e3b4b392ffc2530cdfdae5a4762eabcf983953bf19a330c867f1989614f9cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--PerlTidy \
perl-Test-PerlTidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Path--Tiny \
perl-Perl--Tidy \
perl-Text--Diff \
perl-parent"

inherit rpm
