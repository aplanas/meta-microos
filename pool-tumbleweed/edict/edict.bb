SUMMARY = "The Japanese Dictionary from the EDRDG project (EDICT format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict'/UTF8 variant, a flat text file format, of: \
 \
* the JMdict project's word dictionary ('edict' file) \
* the KANJIDIC project's JIS X 0208-1990 Kanji dictionary (6355 Kanji) \
* KANJIDIC's JIS X 0212-1990 dictionary (an extra 5801 Kanji) \
* KANJIDIC's JIS X 0213-2012 dictionary (an extra 952 Kanji) \
* kanji-to-radical and radical-to-kanji indices \
* ENAMDICT, a dictionary for proper names \
 \
Other formats are in the edict2 and jmdict packages."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20230511"

RPM_NAME = "edict-20230511-1.1.noarch.rpm"
RPM_HASH = "4ef9da38c9b6202705f98347c682ee27f2ab633daebd40190eedb6f9942e79c3ac467a4faa3d4b58df10d6e0487500ca17fed40649b1b03671b4a794ebb4d94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict"

RDEPENDS:${PN} += ""

inherit rpm
