SUMMARY = "The Japanese Dictionary from the EDRDG project (EDICT format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict' variant, a flat text file format, of: \
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

PV = "20230411"

RPM_NAME = "edict-20230411-1.1.noarch.rpm"
RPM_HASH = "51db706ca971088ef47250f76602a507ee2466ba90110e0ff1207fd501cf80b50b16c5c5aad4d026daf86b74f646c8a49a20036ba757040c2ea5be4aad767d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict"
RDEPENDS:${PN} += ""

inherit rpm
