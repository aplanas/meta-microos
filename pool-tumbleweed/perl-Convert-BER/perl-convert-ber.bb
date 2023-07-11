SUMMARY = "ASN.1 Basic Encoding Rules"
DESCRIPTION = "Convert::BER is a Perl object class implementation for encoding and \
decoding objects as described by ITU-T standard X.209 (ASN.1) using \
Basic Encoding Rules (BER). \
 \
WARNING this module is no longer supported, See Convert::ASN1"
LICENSE = "GPL-2.0+"

PV = "1.32"

RPM_NAME = "perl-Convert-BER-1.32-27.30.aarch64.rpm"
RPM_HASH = "3d7928ef6aa124baddc0f973c40c34b43decbc148fcde5095f9a87ef2a98aaf5e912f10ff8b430875d4dadf8b2395f3281ade71fea5aece219ad83546d41355c"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
