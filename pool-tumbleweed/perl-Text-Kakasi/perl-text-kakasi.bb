SUMMARY = "Perl binding for KAKASI, the kanji kana simple inverter"
DESCRIPTION = "This module provides libkakasi interface for perl. libkakasi is a part \
of KAKASI.  KAKASI is the language processing filter to convert Kanji \
characters to Hiragana, Katakana or Romaji and may be helpful to read \
Japanese documents.  More information about KAKASI is available at \
<http://kakasi.namazu.org/>."
LICENSE = "GPL-2.0+"

PV = "2.04"

RPM_NAME = "perl-Text-Kakasi-2.04-164.39.aarch64.rpm"
RPM_HASH = "0d68fa0c7b40f725d2c7ffbb04b135856634d8181e7e246ecb41f23e6474e0525e28f4e669c6316575d9bda4b000d3d0cf9503107aa016781f131415e020fa52"

RPROVIDES:${PN} += "perl-Text--Kakasi \
perl-Text-Kakasi"

RDEPENDS:${PN} += "kakasi \
libc.so.6 \
libkakasi.so.2 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
