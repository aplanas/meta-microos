SUMMARY = "Translations for package vocal"
DESCRIPTION = "Provides translations for the 'vocal' package."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "vocal-lang-2.4.2-5.5.noarch.rpm"
RPM_HASH = "8c56061c56ea86842a56388d14af06d0b574cc07ea0e1a0a74555bc19711405704c4660fde75bf84cea9bdcc9ae039d8785be43a8d6d491d4f89bfccf0e4f3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vocal-af \
locale-vocal-ar \
locale-vocal-as \
locale-vocal-ast \
locale-vocal-az \
locale-vocal-be \
locale-vocal-bg \
locale-vocal-bn \
locale-vocal-br \
locale-vocal-bs \
locale-vocal-ca \
locale-vocal-cs \
locale-vocal-cy \
locale-vocal-da \
locale-vocal-de \
locale-vocal-de-DE \
locale-vocal-dz \
locale-vocal-el \
locale-vocal-el-GR \
locale-vocal-en \
locale-vocal-en-AU \
locale-vocal-en-CA \
locale-vocal-en-GB \
locale-vocal-eo \
locale-vocal-es \
locale-vocal-es-SV \
locale-vocal-et \
locale-vocal-eu \
locale-vocal-fa \
locale-vocal-fi \
locale-vocal-fr \
locale-vocal-fr-CA \
locale-vocal-fr-FR \
locale-vocal-ga \
locale-vocal-gd \
locale-vocal-gl \
locale-vocal-gu \
locale-vocal-he \
locale-vocal-hi \
locale-vocal-hr \
locale-vocal-hu \
locale-vocal-ia \
locale-vocal-id \
locale-vocal-is \
locale-vocal-it \
locale-vocal-ja \
locale-vocal-ka \
locale-vocal-kk \
locale-vocal-km \
locale-vocal-kn \
locale-vocal-ko \
locale-vocal-lt \
locale-vocal-lv \
locale-vocal-mk \
locale-vocal-ml \
locale-vocal-mr \
locale-vocal-ms \
locale-vocal-nb \
locale-vocal-ne \
locale-vocal-nl \
locale-vocal-nn \
locale-vocal-oc \
locale-vocal-or \
locale-vocal-pa \
locale-vocal-pl \
locale-vocal-pt \
locale-vocal-pt-BR \
locale-vocal-ro \
locale-vocal-ru \
locale-vocal-ru-RU \
locale-vocal-si \
locale-vocal-sk \
locale-vocal-sl \
locale-vocal-sq \
locale-vocal-sr \
locale-vocal-sv \
locale-vocal-ta \
locale-vocal-te \
locale-vocal-th \
locale-vocal-tr \
locale-vocal-ug \
locale-vocal-uk \
locale-vocal-vi \
locale-vocal-wa \
locale-vocal-zh \
locale-vocal-zh-CN \
locale-vocal-zh-HK \
locale-vocal-zh-TW \
vocal-lang \
vocal-lang-all"

RDEPENDS:${PN} += "vocal"

inherit rpm
