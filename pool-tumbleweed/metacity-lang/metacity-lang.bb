SUMMARY = "Translations for package metacity"
DESCRIPTION = "Provides translations for the 'metacity' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-lang-3.46.1-1.2.noarch.rpm"
RPM_HASH = "8a444ede01d8ad3d05a7d65c3e13855ce4efafad07cd8f62cd082bf2f9ad8374819a51f8e204dcdd89dcb0052d5a6bacbcb02f8739f16ea00295d0378aa8084f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-metacity-ar \
locale-metacity-as \
locale-metacity-ast \
locale-metacity-az \
locale-metacity-be \
locale-metacity-be@latin \
locale-metacity-bg \
locale-metacity-bn \
locale-metacity-bn-IN \
locale-metacity-br \
locale-metacity-bs \
locale-metacity-ca \
locale-metacity-ca@valencia \
locale-metacity-cs \
locale-metacity-cy \
locale-metacity-da \
locale-metacity-de \
locale-metacity-dz \
locale-metacity-el \
locale-metacity-en-CA \
locale-metacity-en-GB \
locale-metacity-en@shaw \
locale-metacity-eo \
locale-metacity-es \
locale-metacity-et \
locale-metacity-eu \
locale-metacity-fa \
locale-metacity-fi \
locale-metacity-fr \
locale-metacity-ga \
locale-metacity-gl \
locale-metacity-gu \
locale-metacity-he \
locale-metacity-hi \
locale-metacity-hr \
locale-metacity-hu \
locale-metacity-id \
locale-metacity-is \
locale-metacity-it \
locale-metacity-ja \
locale-metacity-ka \
locale-metacity-kn \
locale-metacity-ko \
locale-metacity-lt \
locale-metacity-lv \
locale-metacity-mai \
locale-metacity-mk \
locale-metacity-ml \
locale-metacity-mr \
locale-metacity-ms \
locale-metacity-nb \
locale-metacity-nds \
locale-metacity-ne \
locale-metacity-nl \
locale-metacity-nn \
locale-metacity-oc \
locale-metacity-or \
locale-metacity-pa \
locale-metacity-pl \
locale-metacity-pt \
locale-metacity-pt-BR \
locale-metacity-ro \
locale-metacity-ru \
locale-metacity-si \
locale-metacity-sk \
locale-metacity-sl \
locale-metacity-sq \
locale-metacity-sr \
locale-metacity-sr@latin \
locale-metacity-sv \
locale-metacity-ta \
locale-metacity-te \
locale-metacity-th \
locale-metacity-tr \
locale-metacity-ug \
locale-metacity-uk \
locale-metacity-vi \
locale-metacity-wa \
locale-metacity-zh-CN \
locale-metacity-zh-HK \
locale-metacity-zh-TW \
metacity-lang \
metacity-lang-all"

RDEPENDS:${PN} += "metacity"

inherit rpm
