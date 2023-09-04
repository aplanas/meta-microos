SUMMARY = "Extra sets of Chinese encodings"
DESCRIPTION = "Perl 5.7.3 and later ships with an adequate set of Chinese encodings, \
including the most used CP950, CP936 (also known as GBK), Big5, \
Big5-HKSCS, EUC-CN, HZ, and ISO-IR-165. \
 \
However, the numbers of Chinese encodings are staggering, and a \
complete coverage will easily increase the size of perl distribution by \
several megabytes; hence, this CPAN module tries to provide the rest of \
them."
LICENSE = "MIT"

PV = "0.23"

RPM_NAME = "perl-Encode-HanExtra-0.23-89.29.aarch64.rpm"
RPM_HASH = "42f7a9c1954a8472af3163f9cd89ac414894f83dea74d5abca58aef73f0cee3a667e51a5e1002a6ff9557c01855c3dfa58cb472af4a1d184994cefbd0ca371b9"

RPROVIDES:${PN} += "perl-Encode--HanExtra \
perl-Encode--TW--Unisys--SOSI1 \
perl-Encode--TW--Unisys--SOSI2 \
perl-Encode-HanExtra"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
