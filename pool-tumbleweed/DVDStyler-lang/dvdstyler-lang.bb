SUMMARY = "Translations for package DVDStyler"
DESCRIPTION = "Provides translations for the 'DVDStyler' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "DVDStyler-lang-3.2.1-2.6.noarch.rpm"
RPM_HASH = "e693985d3c7ff080221a556c21f4c55b1b8514cd05841824aef5099b8f319560921746c7867b0b3b942eadb074aaffffd15815228cc8c02fa412a9100c623906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "DVDStyler-lang \
DVDStyler-lang-all \
locale-DVDStyler-ar \
locale-DVDStyler-bg \
locale-DVDStyler-ca \
locale-DVDStyler-cs \
locale-DVDStyler-da \
locale-DVDStyler-de \
locale-DVDStyler-el \
locale-DVDStyler-es \
locale-DVDStyler-eu \
locale-DVDStyler-fi \
locale-DVDStyler-fr \
locale-DVDStyler-hu \
locale-DVDStyler-it \
locale-DVDStyler-ja \
locale-DVDStyler-ko \
locale-DVDStyler-mk \
locale-DVDStyler-nb \
locale-DVDStyler-nl \
locale-DVDStyler-pl \
locale-DVDStyler-pt \
locale-DVDStyler-pt-BR \
locale-DVDStyler-ro \
locale-DVDStyler-ru \
locale-DVDStyler-si \
locale-DVDStyler-sk \
locale-DVDStyler-sl \
locale-DVDStyler-sr \
locale-DVDStyler-sv \
locale-DVDStyler-tr \
locale-DVDStyler-uk \
locale-DVDStyler-vi \
locale-DVDStyler-zh-CN \
locale-DVDStyler-zh-TW"

RDEPENDS:${PN} += "DVDStyler"

inherit rpm
