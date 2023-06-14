SUMMARY = "Translations for package pulseeffects"
DESCRIPTION = "Provides translations for the 'pulseeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.7"

RPM_NAME = "pulseeffects-lang-4.8.7-1.8.noarch.rpm"
RPM_HASH = "b70aa1a84caf2d68abae00176ff8e000621d03c6b146525360498fa55270f8743edbf32db8e0900b170da9bc75dab3f837bdd36f550dcce9a4dd93be480494fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pulseeffects-cs \
locale-pulseeffects-de \
locale-pulseeffects-fr-FR \
locale-pulseeffects-hr \
locale-pulseeffects-it-IT \
locale-pulseeffects-pl \
locale-pulseeffects-pt-BR \
locale-pulseeffects-ru \
locale-pulseeffects-sk \
locale-pulseeffects-sv \
pulseeffects-lang \
pulseeffects-lang-all"

RDEPENDS:${PN} += "pulseeffects"

inherit rpm
