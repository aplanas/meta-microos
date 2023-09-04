SUMMARY = "Convert between perl data structures and ASN.1 encoded packets"
DESCRIPTION = "Convert::ASN1 encodes and decodes ASN.1 data structures using BER/DER \
rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.340.0"

RPM_NAME = "perl-Convert-ASN1-0.340.0-1.1.noarch.rpm"
RPM_HASH = "237bd83f01a7be677183b8a4bd0eb81f1fa93657ed27b8f8b5e2105b081db7261e813ad039757a11dcdf2cb3ab30b9ad3d33caa1262a25e22e09206c5b3261df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--ASN1 \
perl-Convert--ASN1--parser \
perl-Convert-ASN1"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
