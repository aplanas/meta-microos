SUMMARY = "Perl binding for KAKASI, the kanji kana simple inverter"
DESCRIPTION = "This module provides libkakasi interface for perl. libkakasi is a part \
of KAKASI.  KAKASI is the language processing filter to convert Kanji \
characters to Hiragana, Katakana or Romaji and may be helpful to read \
Japanese documents.  More information about KAKASI is available at \
<http://kakasi.namazu.org/>."
LICENSE = "GPL-2.0+"

PV = "2.04"

RPM_NAME = "perl-Text-Kakasi-2.04-164.38.aarch64.rpm"
RPM_HASH = "a547ace258770f2b30dc9ff7f7e04d9c84076c24d4cc063fec650c02d9c0d81ccd7159de3187731dd9891f9f440a9232a36ecc54cb71b05cdbc13e5e67efe389"

RPROVIDES:${PN} += "perl-Text--Kakasi \
perl-Text-Kakasi"

RDEPENDS:${PN} += "kakasi \
libc.so.6 \
libkakasi.so.2 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
