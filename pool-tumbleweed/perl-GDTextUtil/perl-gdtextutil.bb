SUMMARY = "GDTextUtil Perl module"
DESCRIPTION = "GDTextUtil Perl module"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.86"

RPM_NAME = "perl-GDTextUtil-0.86-99.19.noarch.rpm"
RPM_HASH = "058ec9e949c5eff38f9013fbfb6aafcfff248224a448eb5d6f74e5e7b5dfcc41a45d4cc6c6a109f47d9503a917dc88ce3e93ea88cb988db81b21aaa364554eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Text \
perl-GD--Text--Align \
perl-GD--Text--Wrap \
perl-GDTextUtil"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-GD"

inherit rpm
