SUMMARY = "Translations for package deja-dup"
DESCRIPTION = "Provides translations for the 'deja-dup' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "deja-dup-lang-44.1-1.2.noarch.rpm"
RPM_HASH = "d3c852f3a3c767bde2f99fca0495a2c5d08a05f3ac79d8e63bf6d3f45e24a4b0a12ba12e4583670ff1c9024685772ff9f5ea23886c39db1efbb4ee9b509138d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deja-dup-lang \
deja-dup-lang-all \
locale-deja-dup-af \
locale-deja-dup-ar \
locale-deja-dup-ast \
locale-deja-dup-az \
locale-deja-dup-be \
locale-deja-dup-bg \
locale-deja-dup-bn \
locale-deja-dup-bs \
locale-deja-dup-ca \
locale-deja-dup-ca@valencia \
locale-deja-dup-cs \
locale-deja-dup-cy \
locale-deja-dup-da \
locale-deja-dup-de \
locale-deja-dup-el \
locale-deja-dup-en-AU \
locale-deja-dup-en-CA \
locale-deja-dup-en-GB \
locale-deja-dup-eo \
locale-deja-dup-es \
locale-deja-dup-et \
locale-deja-dup-eu \
locale-deja-dup-fa \
locale-deja-dup-fi \
locale-deja-dup-fr \
locale-deja-dup-fr-CA \
locale-deja-dup-fur \
locale-deja-dup-gd \
locale-deja-dup-gl \
locale-deja-dup-he \
locale-deja-dup-hi \
locale-deja-dup-hr \
locale-deja-dup-hu \
locale-deja-dup-ia \
locale-deja-dup-id \
locale-deja-dup-it \
locale-deja-dup-ja \
locale-deja-dup-ka \
locale-deja-dup-kk \
locale-deja-dup-km \
locale-deja-dup-ko \
locale-deja-dup-lt \
locale-deja-dup-lv \
locale-deja-dup-ml \
locale-deja-dup-mr \
locale-deja-dup-ms \
locale-deja-dup-nb \
locale-deja-dup-ne \
locale-deja-dup-nl \
locale-deja-dup-nn \
locale-deja-dup-oc \
locale-deja-dup-pa \
locale-deja-dup-pl \
locale-deja-dup-pt \
locale-deja-dup-pt-BR \
locale-deja-dup-ro \
locale-deja-dup-ru \
locale-deja-dup-si \
locale-deja-dup-sk \
locale-deja-dup-sl \
locale-deja-dup-sq \
locale-deja-dup-sr \
locale-deja-dup-sv \
locale-deja-dup-ta \
locale-deja-dup-te \
locale-deja-dup-th \
locale-deja-dup-tr \
locale-deja-dup-ug \
locale-deja-dup-uk \
locale-deja-dup-vi \
locale-deja-dup-zh-CN \
locale-deja-dup-zh-HK \
locale-deja-dup-zh-TW"

RDEPENDS:${PN} += "deja-dup"

inherit rpm
