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

RPM_NAME = "libnuspell5-5.1.2-1.5.aarch64.rpm"
RPM_HASH = "37eb9b5fbeb9e4e20b93310b5446bc8d66f244e5c8c98d066acacd0e94992d66505336ad43d8b1d96f126308fe64b46132dce5e4feb875998529ee86478f8a4b"

RPROVIDES:${PN} += "libnuspell.so.5 \
libnuspell5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
