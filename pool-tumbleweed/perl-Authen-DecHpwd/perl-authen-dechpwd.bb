SUMMARY = "DEC VMS password hashing"
DESCRIPTION = "This module implements the 'SYS$HASH_PASSWORD' password hashing function \
from VMS (also known as 'LGI$HPWD'), and some associated VMS username and \
password handling functions. \
 \
The password hashing function is implemented in XS, with a hideously slow \
pure Perl backup version for systems that can't handle XS."
LICENSE = "GPL-2.0+"

PV = "2.007"

RPM_NAME = "perl-Authen-DecHpwd-2.007-1.30.aarch64.rpm"
RPM_HASH = "e40c2e483cdb6f18486ed683fbc761e5e92169bec20fee69b566c1cfa153537bdf762409fbd51551c00d8aab4226fb9ba4a2faf4e049b568ee9997bca49bf0e8"

RPROVIDES:${PN} += "perl-Authen--DecHpwd \
perl-Authen-DecHpwd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Data--Integer \
perl-Digest--CRC \
perl-Scalar--String \
perl-parent"

inherit rpm
