SUMMARY = "Translations for package yakuake"
DESCRIPTION = "Provides translations for the 'yakuake' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "yakuake-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "242c5a019fc0061eb0f6fd49390808422ae6b5b35b13335b0baae06a77a78bab33db079a097c96e1511611533d5f1ef7f43432ddf4fbf87469429c5548bac08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yakuake-ar \
locale-yakuake-az \
locale-yakuake-be \
locale-yakuake-bg \
locale-yakuake-bs \
locale-yakuake-ca \
locale-yakuake-ca@valencia \
locale-yakuake-cs \
locale-yakuake-da \
locale-yakuake-de \
locale-yakuake-el \
locale-yakuake-en-GB \
locale-yakuake-eo \
locale-yakuake-es \
locale-yakuake-et \
locale-yakuake-eu \
locale-yakuake-fi \
locale-yakuake-fr \
locale-yakuake-ga \
locale-yakuake-gl \
locale-yakuake-hi \
locale-yakuake-hr \
locale-yakuake-hu \
locale-yakuake-ia \
locale-yakuake-id \
locale-yakuake-is \
locale-yakuake-it \
locale-yakuake-ja \
locale-yakuake-ka \
locale-yakuake-km \
locale-yakuake-ko \
locale-yakuake-lt \
locale-yakuake-mai \
locale-yakuake-ml \
locale-yakuake-mr \
locale-yakuake-nb \
locale-yakuake-nds \
locale-yakuake-nl \
locale-yakuake-nn \
locale-yakuake-pa \
locale-yakuake-pl \
locale-yakuake-pt \
locale-yakuake-pt-BR \
locale-yakuake-ro \
locale-yakuake-ru \
locale-yakuake-sk \
locale-yakuake-sl \
locale-yakuake-sr \
locale-yakuake-sr@ijekavian \
locale-yakuake-sr@ijekavianlatin \
locale-yakuake-sr@latin \
locale-yakuake-sv \
locale-yakuake-ta \
locale-yakuake-th \
locale-yakuake-tr \
locale-yakuake-ug \
locale-yakuake-uk \
locale-yakuake-wa \
locale-yakuake-zh-CN \
locale-yakuake-zh-TW \
yakuake-lang \
yakuake-lang-all"

RDEPENDS:${PN} += "yakuake"

inherit rpm
