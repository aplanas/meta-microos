SUMMARY = "ASN.1 Basic Encoding Rules"
DESCRIPTION = "Convert::BER is a Perl object class implementation for encoding and \
decoding objects as described by ITU-T standard X.209 (ASN.1) using \
Basic Encoding Rules (BER). \
 \
WARNING this module is no longer supported, See Convert::ASN1"
LICENSE = "GPL-2.0+"

PV = "1.32"

RPM_NAME = "perl-Convert-BER-1.32-27.29.aarch64.rpm"
RPM_HASH = "926f67833dd30d7b01b6812a767e1598001583d3f96769e800e031f95dad218afb3f6c24db614573b4b743d915dde4df6dc1cd86b0414095a8b7cbdb8d5dd881"

RPROVIDES:${PN} += "perl-Convert--BER \
perl-Convert--BER---Time-generic \
perl-Convert--BER--ANY \
perl-Convert--BER--BER \
perl-Convert--BER--BIT-STRING \
perl-Convert--BER--BIT-STRING8 \
perl-Convert--BER--BOOLEAN \
perl-Convert--BER--CHOICE \
perl-Convert--BER--CONSTRUCTED \
perl-Convert--BER--INTEGER \
perl-Convert--BER--NULL \
perl-Convert--BER--OBJECT-ID \
perl-Convert--BER--OPTIONAL \
perl-Convert--BER--REAL \
perl-Convert--BER--SEQUENCE \
perl-Convert--BER--SEQUENCE-OF \
perl-Convert--BER--STRING \
perl-Convert-BER \
perl-ber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
