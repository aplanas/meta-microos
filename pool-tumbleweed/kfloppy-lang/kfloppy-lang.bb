SUMMARY = "Translations for package kfloppy"
DESCRIPTION = "Provides translations for the 'kfloppy' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kfloppy-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "75249881525c9ce3f6812bc6e13b8af6702b6a61742c059b27990f11597584fe187e15d5df3d10a9d89df70048b7cb70c20fe1aca88d15acf1608f4593203412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfloppy-lang \
kfloppy-lang-all \
locale-kfloppy-af \
locale-kfloppy-ar \
locale-kfloppy-be \
locale-kfloppy-bg \
locale-kfloppy-br \
locale-kfloppy-bs \
locale-kfloppy-ca \
locale-kfloppy-ca@valencia \
locale-kfloppy-cs \
locale-kfloppy-cy \
locale-kfloppy-da \
locale-kfloppy-de \
locale-kfloppy-el \
locale-kfloppy-en-GB \
locale-kfloppy-eo \
locale-kfloppy-es \
locale-kfloppy-et \
locale-kfloppy-eu \
locale-kfloppy-fa \
locale-kfloppy-fi \
locale-kfloppy-fr \
locale-kfloppy-ga \
locale-kfloppy-gl \
locale-kfloppy-he \
locale-kfloppy-hi \
locale-kfloppy-hr \
locale-kfloppy-hu \
locale-kfloppy-ia \
locale-kfloppy-id \
locale-kfloppy-is \
locale-kfloppy-it \
locale-kfloppy-ja \
locale-kfloppy-ka \
locale-kfloppy-kk \
locale-kfloppy-km \
locale-kfloppy-ko \
locale-kfloppy-lt \
locale-kfloppy-lv \
locale-kfloppy-mk \
locale-kfloppy-mr \
locale-kfloppy-ms \
locale-kfloppy-nb \
locale-kfloppy-nds \
locale-kfloppy-ne \
locale-kfloppy-nl \
locale-kfloppy-nn \
locale-kfloppy-oc \
locale-kfloppy-pa \
locale-kfloppy-pl \
locale-kfloppy-pt \
locale-kfloppy-pt-BR \
locale-kfloppy-ro \
locale-kfloppy-ru \
locale-kfloppy-sk \
locale-kfloppy-sl \
locale-kfloppy-sq \
locale-kfloppy-sr \
locale-kfloppy-sr@ijekavian \
locale-kfloppy-sr@ijekavianlatin \
locale-kfloppy-sr@latin \
locale-kfloppy-sv \
locale-kfloppy-ta \
locale-kfloppy-th \
locale-kfloppy-tr \
locale-kfloppy-ug \
locale-kfloppy-uk \
locale-kfloppy-wa \
locale-kfloppy-zh-CN \
locale-kfloppy-zh-TW"

RDEPENDS:${PN} += "kfloppy"

inherit rpm
