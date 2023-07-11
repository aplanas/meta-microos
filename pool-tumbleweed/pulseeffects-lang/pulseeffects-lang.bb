SUMMARY = "Translations for package pulseeffects"
DESCRIPTION = "Provides translations for the 'pulseeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.7"

RPM_NAME = "pulseeffects-lang-4.8.7-1.9.noarch.rpm"
RPM_HASH = "23a6e4987be9b89d763ba5ddc2ef4635c008a730ad3857728a0b1ee143f667a7f0b16b75f8081f4b3f7e2539d2dc03a1cd66142464d0822a9dce73f9dfbd13f8"
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
