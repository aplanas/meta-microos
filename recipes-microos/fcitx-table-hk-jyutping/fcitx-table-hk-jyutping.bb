SUMMARY = "Hong Kong jyutping table for Fcitx"
DESCRIPTION = "Fcitx Hong Kong Jyutping table for Traditional Chinese. \
 \
This is the jyutping schemes released by Hong Kong government \
in colony era. \
 \
It's used to convert Chinese person and road names to English, \
which can be pronounced easily in International Phonetic Alphabet \
and followed by a native Hongkongnese. \
 \
But people seldomly use it to type in Chinese. its pronounciation \
is hard for a native Chinese to learn. \
 \
And it's a incomplete scheme. \
 \
See: http://en.wikipedia.org/wiki/Hong_Kong_Government_Cantonese_Romanisation  for details \
 \
If you don't know what it is, don't try."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-hk-jyutping-0.3.8-2.5.noarch.rpm"
RPM_HASH = "370186f495a988f0084eebd91601927cbb8bdf800688c3feeab5ae7e2489dbbf7810095b3a1042e605a7d527cce87c9df7fa19772539aae32ed17f4d160df903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra fcitx-table-hk-jyutping"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
