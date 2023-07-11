SUMMARY = "ASN.1 Encode/Decode library"
DESCRIPTION = "Convert::ASN1 encodes and decodes ASN.1 data structures using BER/DER \
rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Convert-ASN1-0.33-1.9.noarch.rpm"
RPM_HASH = "a742dad81e8fb6084d7b72fd059aad4d2664a7c785e7f2167b11ed8172bef93a755cb45fd0e47243a4a628abd6befcfaf7aac4f5af38d485382a83cc9886a4cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--ASN1 \
perl-Convert--ASN1--parser \
perl-Convert-ASN1"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
