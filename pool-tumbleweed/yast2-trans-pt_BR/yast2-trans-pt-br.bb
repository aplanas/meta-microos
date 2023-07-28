SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "3c996c97ca1215dbbb8470a96f448c9cb6639340de03682f961e896f7e757f73d0ed76671a272c741101c37b1cc56ebf415a8e601ef18b1d9efff99f365acb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm
