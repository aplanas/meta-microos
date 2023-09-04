SUMMARY = "Automatic text wrapping and reformatting"
DESCRIPTION = "Automatic text wrapping and reformatting"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-Text-Autoformat-1.75-1.17.noarch.rpm"
RPM_HASH = "240370feae8531c6df237f93f6b0da77075a8f3bee212bd73cf97267d4364a478bd6018028b9027067de8f38b8aa860219893652b02ea21554a36bbd62f28417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Autoformat \
perl-Text--Autoformat--Hang \
perl-Text--Autoformat--NullHang \
perl-Text-Autoformat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Text--Reform"

inherit rpm
