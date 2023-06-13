SUMMARY = "Filter to Convert Kanji Characters to Hiragana, Katakana, or Romaji"
DESCRIPTION = "KAKASI is the language processing filter to convert Kanji characters to \
Hiragana, Katakana, or Romaji(1) and may be helpful for reading \
Japanese documents. The word-splitting patch is merged from version \
2.3.0. \
 \
The name 'KAKASI' is the abbreviation of 'kanji kana simple inverter' \
and the inverse of SKK 'simple kana kanji converter' developed by \
Masahiko Sato at Tohoku University. Most entries of the kakasi \
dictionary are derived from the SKK dictionaries. If interested  in the \
naming of KAKASI, consult a Japanese-English dictionary. \
 \
(1) 'Romaji' is an alphabetical description of Japanese pronunciation."
LICENSE = "GPL-2.0+"

PV = "2.3.6"

RPM_NAME = "kakasi-2.3.6-3.32.aarch64.rpm"
RPM_HASH = "815637a92f46e6fa6a0e72a4e3550f2aa72411a2309ca9dbb4ec8818bd29178526bd08b98fe768c7867ea281f2e7e3e0b3298c41055e4cd59255b2469d557add"

RPROVIDES:${PN} += "kakasi \
kakasi(aarch-64) \
libkakasi.so.2()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
kakasi-dict \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
