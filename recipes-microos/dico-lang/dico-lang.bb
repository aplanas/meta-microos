SUMMARY = "Translations for package dico"
DESCRIPTION = "Provides translations for the 'dico' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-lang-2.11-1.15.noarch.rpm"
RPM_HASH = "bd60d3ad761e499b97b60a432adac717ac693316067fd45e59c766f0c2924dd84a97724e558f4fbc40aac92b7e9bcd349945658e571581b5699d395f3f27121e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dico-lang \
dico-lang-all \
locale(dico:da) \
locale(dico:de) \
locale(dico:es) \
locale(dico:fi) \
locale(dico:fr) \
locale(dico:pl) \
locale(dico:pt_BR) \
locale(dico:sr) \
locale(dico:sv) \
locale(dico:uk)"
RDEPENDS:${PN} += "dico"

inherit rpm
