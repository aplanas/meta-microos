SUMMARY = "ASN.1 Basic Encoding Rules"
DESCRIPTION = "Convert::BER is a Perl object class implementation for encoding and \
decoding objects as described by ITU-T standard X.209 (ASN.1) using \
Basic Encoding Rules (BER). \
 \
WARNING this module is no longer supported, See Convert::ASN1"
LICENSE = "GPL-2.0+"

PV = "1.32"

RPM_NAME = "perl-Convert-BER-1.32-27.31.aarch64.rpm"
RPM_HASH = "68fde4e28d60b8b127bb76362d7f06d8eb4e5201b06bb7cf4e972c5587db1106bb38f6305953ea3c049c676e3cf9c1c438726031dba82af325dea5747342358d"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
