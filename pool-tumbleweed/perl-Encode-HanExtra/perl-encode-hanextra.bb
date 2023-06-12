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

RPM_NAME = "perl-Encode-HanExtra-0.23-89.27.aarch64.rpm"
RPM_HASH = "69d145a6419717569b040630dce8acf1761e6b4248881f07f391f7c6c566a897d4f8ba692489052c748bfd679ae78a226d7bbf32a0d4fce90c4da0058e4ecbe0"

RPROVIDES:${PN} += "perl(Encode::HanExtra) \
perl(Encode::TW::Unisys::SOSI1) \
perl(Encode::TW::Unisys::SOSI2) \
perl-Encode-HanExtra \
perl-Encode-HanExtra(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/enc2xs \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
