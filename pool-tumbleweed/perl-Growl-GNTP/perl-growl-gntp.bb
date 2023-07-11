SUMMARY = "Perl implementation of GNTP Protocol (Client Part)"
DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Growl-GNTP-0.21-1.23.noarch.rpm"
RPM_HASH = "c0b476123500ef2bb42801e9ac6a08f1c050a472902058c9d55a8f53f17f83e2c5d850c9c75382f6578e7a9109ad47eb8c981c14931b91f097833a81e55fb6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Growl--GNTP \
perl-Growl-GNTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Crypt--CBC \
perl-Data--UUID \
perl-Digest--SHA"

inherit rpm
