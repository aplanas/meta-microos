SUMMARY = "Perl module to generate random data"
DESCRIPTION = "A module used to generate random data. Useful mostly for test programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Data-Random-0.13-1.18.noarch.rpm"
RPM_HASH = "1668b3ba276c836437c7f8550d598972aca2bff503f71110e1ebd457ecb3c89180c258f961b98d26b2195812f74e2981a5b1bbed71a0a7dbbad3cc786c328875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Random \
perl-Data--Random--WordList \
perl-Data-Random"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Time--Piece"

inherit rpm
