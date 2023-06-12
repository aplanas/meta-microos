SUMMARY = "The Japanese Dictionary from the EDRDG project (EDICT-EUCJP format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the 'edict'/EUC-JP variant."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20230511"

RPM_NAME = "edict-eucjp-20230511-1.1.noarch.rpm"
RPM_HASH = "f95ab5d9b940efd9670e5c137c8fd44c561ca0ffceed1d0309cf5d62f5fe98edb6928106d5ccb979893650aff4f4f57265287520fcdb8a2a358a8fc17dcc2bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edict-eucjp locale(ja)"
RDEPENDS:${PN} += ""

inherit rpm
