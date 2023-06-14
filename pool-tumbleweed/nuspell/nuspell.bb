SUMMARY = "A spell checker library and command-line tool"
DESCRIPTION = "Nuspell is a spell checker written in C++. It supports languages with \
rich morphology and complex word compounding. \
 \
Main features are: \
 - Full unicode support backed by ICU \
 - Backward compatibility with Hunspell dictionary file format \
 - Twofold affix stripping (for agglutinative languages, like Azeri, \
   Basque, Estonian, Finnish, Hungarian, Turkish, etc.) \
 - Support complex compounds (for example, Hungarian, Germand and Dutch) \
 - Support language specific features (for example, special casing of \
   Azeri and Turkish dotted i, or German sharp s) \
 - Handle conditional affixes, circumfixes, fogemorphemes, forbidden \
   words, pseudoroots and homonyms."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.2"

RPM_NAME = "nuspell-5.1.2-1.5.aarch64.rpm"
RPM_HASH = "e2c214a571a200030de8606c16d57154ec3a4f32aae8050ef01ad21eab6c19f976dff4d51d9a363f7dc86c9b1a65ef8f69513cc89fac6718dbf28041810714d1"

RPROVIDES:${PN} += "nuspell"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libnuspell.so.5 \
libstdc++.so.6"

inherit rpm
