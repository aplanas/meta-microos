SUMMARY = "Translations for package calcurse"
DESCRIPTION = "Provides translations for the 'calcurse' package."
LICENSE = "BSD-2-Clause"

PV = "4.8.1"

RPM_NAME = "calcurse-lang-4.8.1-1.1.noarch.rpm"
RPM_HASH = "73de837b5fd59a81d05daa090d5afc0ab407cc3253c5ca5e92d025ac0cbbb15a0f7ce22dc662d438b79fa70c591f2040604b5d7423130b10fa9c2102bb610688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calcurse-lang \
calcurse-lang-all \
locale-calcurse-de \
locale-calcurse-en-US \
locale-calcurse-es \
locale-calcurse-fr \
locale-calcurse-nl \
locale-calcurse-pt-BR \
locale-calcurse-ru"

RDEPENDS:${PN} += "calcurse"

inherit rpm
