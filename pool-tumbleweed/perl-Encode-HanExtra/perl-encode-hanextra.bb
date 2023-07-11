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

RPM_NAME = "perl-Encode-HanExtra-0.23-89.28.aarch64.rpm"
RPM_HASH = "65d39ad43058c22279c53a88f92950c69c4be0d09608c8ebf2243dbbe00b2a4ce966693959f782a5bea0568b9711df43bcfa7fccd8d3d4b45dc5ad588fa4f58d"

RPROVIDES:${PN} += "perl-Encode--HanExtra \
perl-Encode--TW--Unisys--SOSI1 \
perl-Encode--TW--Unisys--SOSI2 \
perl-Encode-HanExtra"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
