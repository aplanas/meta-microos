SUMMARY = "Internationalizing Domain Names in Applications (IDNA)"
DESCRIPTION = "This module provides an easy-to-use interface for encoding and decoding \
Internationalized Domain Names (IDNs). \
 \
IDNs use characters drawn from a large repertoire (Unicode), but IDNA \
allows the non-ASCII characters to be represented using only the ASCII \
characters already allowed in so-called host names today \
(letter-digit-hyphen, '/[A-Z0-9-]/i'). \
 \
Use this module if you just want to convert domain names (or email \
addresses), using whatever IDNA standard is the best choice at the moment. \
 \
You should be familiar with Unicode support in perl, as this module expects \
correctly encoded input. See perlunitut, perluniintro and perlunicode for \
details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.500"

RPM_NAME = "perl-Net-IDN-Encode-2.500-1.20.aarch64.rpm"
RPM_HASH = "944dbc3a9a4248983f55221878b41cfc86e37adf8bd9fd92cdb068167e8c557c58a10a679dd1406581c8bde00f9329be555f48ae73289f3f3f10cf8d9307f07b"

RPROVIDES:${PN} += "perl-Net--IDN--Encode \
perl-Net--IDN--Punycode \
perl-Net--IDN--Punycode--PP \
perl-Net--IDN--UTS46 \
perl-Net--IDN--UTS46---Mapping \
perl-Net-IDN-Encode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
