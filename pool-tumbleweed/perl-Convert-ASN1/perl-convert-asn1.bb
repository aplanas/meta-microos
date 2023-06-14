SUMMARY = "ASN.1 Encode/Decode library"
DESCRIPTION = "Convert::ASN1 encodes and decodes ASN.1 data structures using BER/DER \
rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Convert-ASN1-0.33-1.8.noarch.rpm"
RPM_HASH = "abb3e3e62b107f93dd59c13aa81d0a62bbaced9b8b5b1a4c1091cd49d1a0197b8751cc54e7daf3501fe817a2a5828400509a4a8e529aac4941bf263852a89508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--ASN1 \
perl-Convert--ASN1--parser \
perl-Convert-ASN1"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
