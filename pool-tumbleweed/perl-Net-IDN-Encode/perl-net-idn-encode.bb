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

RPM_NAME = "perl-Net-IDN-Encode-2.500-1.18.aarch64.rpm"
RPM_HASH = "4f4f9fad091ee5759d78822641b8a1974b615332216b6ae8e0cce55b6235e5276e85029c4181fcfea66f999f0accca7bd0a9ccb000995f43b4d9e2ed841d1741"

RPROVIDES:${PN} += "perl(Net::IDN::Encode) \
perl(Net::IDN::Punycode) \
perl(Net::IDN::Punycode::PP) \
perl(Net::IDN::UTS46) \
perl(Net::IDN::UTS46::_Mapping) \
perl-Net-IDN-Encode \
perl-Net-IDN-Encode(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
