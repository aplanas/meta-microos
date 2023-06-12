SUMMARY = "The Japanese Dictionary from the EDRDG project (JMdict format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the XML variant of: \
 \
* the JMdict project's word dictionary ('JMdict' file) \
* the KANJIDIC project's Kanji dictionary (covering JIS 0208/0212/0213; \
  'kanjidic2.xml' file)"
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20230511"

RPM_NAME = "jmdict-20230511-1.1.noarch.rpm"
RPM_HASH = "7d52d653bb6fc9cf919a87e94bf0f26c4e4f9f3d5d0ba7f2d86dcba5157706a6a1aa5642db1ffa6ea2fc778489372bad5d554283f198fa38f86ccbeb92cdd6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdict \
locale(ja)"
RDEPENDS:${PN} += ""

inherit rpm
