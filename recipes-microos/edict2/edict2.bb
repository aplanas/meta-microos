SUMMARY = "The Japanese Dictionary from the EDRDG project (edict2 format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict2' variant, an expanded version of the flat \
'edict' text format but reflecting the structure of the XML entries, \
of the JMdict word dictionary."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20230411"

RPM_NAME = "edict2-20230411-1.1.noarch.rpm"
RPM_HASH = "08640b92a764ef043b5217d5287ad7727e96738e9215d83e8cef37ef953c5aa7d15b1dc1417daae8bf4f8b0d7b941c07da3401672e85e7f6ee17e79f3812aa5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict2 locale(ja)"
RDEPENDS:${PN} += ""

inherit rpm
