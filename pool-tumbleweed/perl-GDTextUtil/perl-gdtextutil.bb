SUMMARY = "GDTextUtil Perl module"
DESCRIPTION = "GDTextUtil Perl module"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.86"

RPM_NAME = "perl-GDTextUtil-0.86-99.20.noarch.rpm"
RPM_HASH = "cd336320a08eacc39ac36abfc9ed408a87d67337a6792369834527a3182669d5caa506ad941a1c4ab2d3bf5728a1db9096343122ecb23c857cbddbd4855daa9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Text \
perl-GD--Text--Align \
perl-GD--Text--Wrap \
perl-GDTextUtil"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-GD"

inherit rpm
