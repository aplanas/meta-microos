SUMMARY = "DEC VMS password hashing"
DESCRIPTION = "This module implements the 'SYS$HASH_PASSWORD' password hashing function \
from VMS (also known as 'LGI$HPWD'), and some associated VMS username and \
password handling functions. \
 \
The password hashing function is implemented in XS, with a hideously slow \
pure Perl backup version for systems that can't handle XS."
LICENSE = "GPL-2.0+"

PV = "2.007"

RPM_NAME = "perl-Authen-DecHpwd-2.007-1.29.aarch64.rpm"
RPM_HASH = "ca945b652c5dae105a940dfb098c828b6781c6ce015d3597ab306d269a874f1ba07f4a7d805ad4ebe7a6c0a67f322a156f433cc0e401ac43827dbb1ee4745525"

RPROVIDES:${PN} += "perl-Authen--DecHpwd \
perl-Authen-DecHpwd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Data--Integer \
perl-Digest--CRC \
perl-Scalar--String \
perl-parent"

inherit rpm
