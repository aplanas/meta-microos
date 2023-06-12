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

PV = "20230511"

RPM_NAME = "edict2-20230511-1.1.noarch.rpm"
RPM_HASH = "6827dcc402529b5c3c38c787838c49cb4759cdf5aeb85923663657f9dc78daa36e05b297ec871e8dc8721ffa8dfe3f5118febca9c683e8ff202d6dc6173b7c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict2 \
locale(ja)"
RDEPENDS:${PN} += ""

inherit rpm
