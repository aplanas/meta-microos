SUMMARY = "Monospaced Fonts for Minority Languages of Russia"
DESCRIPTION = "PT Mono was developed for the special needs — for use in forms, tables, \
work sheets etc. Equal widths of characters are very helpful in setting \
complex documents, with such font you may easily calculate size of entry \
fields, column widths in tables and so on. One of the most important \
area of use is Web sites of “electronic governments“ where visitors have \
to fill different request forms. Currently PT Mono consists of Regular \
and Bold styles. \
 \
The fonts beside standard Western, Central European and Cyrillic code \
pages contain characters of all title languages of Russian Federation \
that make them unique and very important tool of the modern digital \
communications."
LICENSE = "OFL-1.1"

PV = "1.003OFL"

RPM_NAME = "paratype-pt-mono-fonts-1.003OFL-3.17.noarch.rpm"
RPM_HASH = "e126acc91e182151c405123a6756c25b2b49b878ae357df2b2dfe128199499a06ba48c9192facf3d1f57f121902749e69490d9b512c8c7c4d21b9c4f23fbc4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-be;ru;uk \
paratype-pt-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
