SUMMARY = "Perl binding for KAKASI, the kanji kana simple inverter"
DESCRIPTION = "This module provides libkakasi interface for perl. libkakasi is a part \
of KAKASI.  KAKASI is the language processing filter to convert Kanji \
characters to Hiragana, Katakana or Romaji and may be helpful to read \
Japanese documents.  More information about KAKASI is available at \
<http://kakasi.namazu.org/>."
LICENSE = "GPL-2.0+"

PV = "2.04"

RPM_NAME = "perl-Text-Kakasi-2.04-164.37.aarch64.rpm"
RPM_HASH = "9fd9151dc9709b3f5dbcc35a6649a5afd510d5258a2e93d0d0c2e1f18487d94c8f9c42eaaf8070596f7c40e7f979f8515692cdb8da5d32be674987674ec506af"

RPROVIDES:${PN} += "perl(Text::Kakasi) \
perl-Text-Kakasi \
perl-Text-Kakasi(aarch-64)"

RDEPENDS:${PN} += "kakasi \
libc.so.6(GLIBC_2.17)(64bit) \
libkakasi.so.2()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
