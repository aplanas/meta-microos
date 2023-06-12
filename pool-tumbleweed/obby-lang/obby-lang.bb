SUMMARY = "Translations for package obby"
DESCRIPTION = "Provides translations for the 'obby' package."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-lang-0.4.8-11.29.noarch.rpm"
RPM_HASH = "4baf8255e433195dca1288154ded70dfe6159fdf8cdfbdbdcee189b2db436d6a560920a29e707c872515a17b7355779fe176cbbb2286332ab69f4b4a3d5803bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(obby:ast) \
locale(obby:ca) \
locale(obby:da) \
locale(obby:de) \
locale(obby:en_GB) \
locale(obby:es) \
locale(obby:fr) \
locale(obby:it) \
locale(obby:nl) \
locale(obby:oc) \
locale(obby:pt_BR) \
locale(obby:sv) \
locale(obby:uk) \
obby-lang \
obby-lang-all"
RDEPENDS:${PN} += "obby"

inherit rpm
