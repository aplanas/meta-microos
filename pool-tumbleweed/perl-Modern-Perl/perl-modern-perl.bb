SUMMARY = "Enable all of the features of Modern Perl with one import"
DESCRIPTION = "enable all of the features of Modern Perl with one import"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230106"

RPM_NAME = "perl-Modern-Perl-1.20230106-1.3.noarch.rpm"
RPM_HASH = "30c48511d1e21b12cd8d8fded3b1a4f1a7d044b95dca19e8a33999213c002b3424e3456bdfb30fbd53d7cc106b124ab0763868475d0b6d97f2d0262db2c9223b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Modern--Perl \
perl-Modern-Perl \
perl-odern--Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-feature \
perl-mro"

inherit rpm
