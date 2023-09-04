SUMMARY = "Check that all your files are tidy"
DESCRIPTION = "This test submodule runs perltidy on files and reports errors if any \
of the files differ after having been tidied. It does not permanently \
modify the files being tested. \
 \
By default, perltidy will be run on files under the current directory \
and its subdirectories with extensions matching: .pm .pl .PL .t."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20230226"

RPM_NAME = "perl-Test-PerlTidy-20230226-1.3.noarch.rpm"
RPM_HASH = "f5caa71cc1877bd16619b308db0c2529b1268c56770b844a361fb4d5f17e6016ce23b27512f823284626cceb189d298c1a34d12473cdae799917ec1d6d117d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--PerlTidy \
perl-Test-PerlTidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Path--Tiny \
perl-Perl--Tidy \
perl-Text--Diff \
perl-parent"

inherit rpm
