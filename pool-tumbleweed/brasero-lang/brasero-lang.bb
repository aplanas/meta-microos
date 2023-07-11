SUMMARY = "Translations for package brasero"
DESCRIPTION = "Provides translations for the 'brasero' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "brasero-lang-3.12.3-2.8.noarch.rpm"
RPM_HASH = "88bd20c6c4af4be2c0fa8df504892d25057b9896e7c24e6df0d6b6d478ab32219988de47b582335ab2a06363618470bc2c49dd424d3328fe7851c4a48133f5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brasero-lang \
brasero-lang-all \
locale-brasero-af \
locale-brasero-ar \
locale-brasero-as \
locale-brasero-ast \
locale-brasero-be \
locale-brasero-bg \
locale-brasero-bn \
locale-brasero-bn-IN \
locale-brasero-br \
locale-brasero-bs \
locale-brasero-ca \
locale-brasero-ca@valencia \
locale-brasero-cs \
locale-brasero-da \
locale-brasero-de \
locale-brasero-dz \
locale-brasero-el \
locale-brasero-en-CA \
locale-brasero-en-GB \
locale-brasero-en@shaw \
locale-brasero-eo \
locale-brasero-es \
locale-brasero-et \
locale-brasero-eu \
locale-brasero-fa \
locale-brasero-fi \
locale-brasero-fr \
locale-brasero-fur \
locale-brasero-ga \
locale-brasero-gd \
locale-brasero-gl \
locale-brasero-gu \
locale-brasero-he \
locale-brasero-hi \
locale-brasero-hr \
locale-brasero-hu \
locale-brasero-id \
locale-brasero-is \
locale-brasero-it \
locale-brasero-ja \
locale-brasero-kk \
locale-brasero-km \
locale-brasero-kn \
locale-brasero-ko \
locale-brasero-lt \
locale-brasero-lv \
locale-brasero-mai \
locale-brasero-mk \
locale-brasero-ml \
locale-brasero-mr \
locale-brasero-ms \
locale-brasero-nb \
locale-brasero-nds \
locale-brasero-ne \
locale-brasero-nl \
locale-brasero-nn \
locale-brasero-oc \
locale-brasero-or \
locale-brasero-pa \
locale-brasero-pl \
locale-brasero-pt \
locale-brasero-pt-BR \
locale-brasero-ro \
locale-brasero-ru \
locale-brasero-sk \
locale-brasero-sl \
locale-brasero-sr \
locale-brasero-sr@latin \
locale-brasero-sv \
locale-brasero-ta \
locale-brasero-te \
locale-brasero-th \
locale-brasero-tr \
locale-brasero-ug \
locale-brasero-uk \
locale-brasero-vi \
locale-brasero-zh-CN \
locale-brasero-zh-HK \
locale-brasero-zh-TW"

RDEPENDS:${PN} += "brasero"

inherit rpm
