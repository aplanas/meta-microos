SUMMARY = "Translations for package dico"
DESCRIPTION = "Provides translations for the 'dico' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-lang-2.11-1.16.noarch.rpm"
RPM_HASH = "a2e16defdf69ddd32f45b840d50eb5a3bfc715d3bfd5566cdba09d50b5d8cf3438ab59526b19faa8d9149f49a4a0412ce49fa667b58eb2c21925111bd199f238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dico-lang \
dico-lang-all \
locale-dico-da \
locale-dico-de \
locale-dico-es \
locale-dico-fi \
locale-dico-fr \
locale-dico-pl \
locale-dico-pt-BR \
locale-dico-sr \
locale-dico-sv \
locale-dico-uk"

RDEPENDS:${PN} += "dico"

inherit rpm
