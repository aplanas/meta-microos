SUMMARY = "Translations for package labplot-kf5"
DESCRIPTION = "Provides translations for the 'labplot-kf5' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.1"

RPM_NAME = "labplot-kf5-lang-2.10.1-2.1.noarch.rpm"
RPM_HASH = "3615836e299430d6268604ac037c4be4ba03bf0a080d640e56fb10e1455555588716231b8537af5e652889045aca52a905f2ba011c32c30c78c4909c565e4c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "labplot-kf5-lang \
labplot-kf5-lang-all \
locale-labplot-kf5-bs \
locale-labplot-kf5-ca \
locale-labplot-kf5-ca@valencia \
locale-labplot-kf5-cs \
locale-labplot-kf5-da \
locale-labplot-kf5-de \
locale-labplot-kf5-el \
locale-labplot-kf5-en-GB \
locale-labplot-kf5-es \
locale-labplot-kf5-eu \
locale-labplot-kf5-fi \
locale-labplot-kf5-fr \
locale-labplot-kf5-gl \
locale-labplot-kf5-hu \
locale-labplot-kf5-ia \
locale-labplot-kf5-it \
locale-labplot-kf5-ja \
locale-labplot-kf5-ka \
locale-labplot-kf5-lt \
locale-labplot-kf5-nds \
locale-labplot-kf5-nl \
locale-labplot-kf5-pl \
locale-labplot-kf5-pt \
locale-labplot-kf5-pt-BR \
locale-labplot-kf5-ru \
locale-labplot-kf5-sk \
locale-labplot-kf5-sl \
locale-labplot-kf5-sv \
locale-labplot-kf5-tr \
locale-labplot-kf5-uk \
locale-labplot-kf5-zh-CN \
locale-labplot-kf5-zh-TW"

RDEPENDS:${PN} += "labplot-kf5"

inherit rpm
