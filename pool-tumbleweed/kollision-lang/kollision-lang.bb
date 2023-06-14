SUMMARY = "Translations for package kollision"
DESCRIPTION = "Provides translations for the 'kollision' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kollision-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "cff7d03fec67de599788bdf26aae1ff22199ac0cff662720a968cedf0f0b11050b1a2d9e0af1dd9c22dd05f31e90bb522d6f6eb70f24bace1808400004691f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kollision-lang \
kollision-lang-all \
locale-kollision-ar \
locale-kollision-bg \
locale-kollision-bs \
locale-kollision-ca \
locale-kollision-ca@valencia \
locale-kollision-cs \
locale-kollision-da \
locale-kollision-de \
locale-kollision-el \
locale-kollision-en-GB \
locale-kollision-eo \
locale-kollision-es \
locale-kollision-et \
locale-kollision-eu \
locale-kollision-fi \
locale-kollision-fr \
locale-kollision-ga \
locale-kollision-gl \
locale-kollision-gu \
locale-kollision-hr \
locale-kollision-hu \
locale-kollision-id \
locale-kollision-is \
locale-kollision-it \
locale-kollision-ja \
locale-kollision-ka \
locale-kollision-kk \
locale-kollision-km \
locale-kollision-ko \
locale-kollision-lt \
locale-kollision-lv \
locale-kollision-mai \
locale-kollision-ml \
locale-kollision-mr \
locale-kollision-nb \
locale-kollision-nds \
locale-kollision-nl \
locale-kollision-nn \
locale-kollision-pa \
locale-kollision-pl \
locale-kollision-pt \
locale-kollision-pt-BR \
locale-kollision-ro \
locale-kollision-ru \
locale-kollision-sk \
locale-kollision-sl \
locale-kollision-sq \
locale-kollision-sr \
locale-kollision-sr@ijekavian \
locale-kollision-sr@ijekavianlatin \
locale-kollision-sr@latin \
locale-kollision-sv \
locale-kollision-th \
locale-kollision-tr \
locale-kollision-ug \
locale-kollision-uk \
locale-kollision-zh-CN \
locale-kollision-zh-TW"

RDEPENDS:${PN} += "kollision"

inherit rpm
