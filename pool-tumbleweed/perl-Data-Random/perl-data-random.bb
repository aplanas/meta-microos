SUMMARY = "Perl module to generate random data"
DESCRIPTION = "A module used to generate random data. Useful mostly for test programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Data-Random-0.13-1.19.noarch.rpm"
RPM_HASH = "69dc5bd8f70cc75553d0e3f19e1b9c2bd31e7bb23605bf2ffe94518262d59e8716ebc8c082a2415a57fa8c6862c1ae4e6923084a08b3326f554a101f93c9e560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Random \
perl-Data--Random--WordList \
perl-Data-Random"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Time--Piece"

inherit rpm
