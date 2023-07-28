SUMMARY = "Translations for package alacarte"
DESCRIPTION = "Provides translations for the 'alacarte' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.3"

RPM_NAME = "alacarte-lang-3.44.3-1.1.noarch.rpm"
RPM_HASH = "48dc0bfe7de9fa1874d1dbe7e6580c1cc04ebfc09a2aa98476c176965646a9057dbab9fee36d0fafbaf69249f2db52c35608379bd34fc9e5dbd0a587b4205ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacarte-lang \
alacarte-lang-all \
locale-alacarte-af \
locale-alacarte-ar \
locale-alacarte-as \
locale-alacarte-ast \
locale-alacarte-be \
locale-alacarte-be@latin \
locale-alacarte-bg \
locale-alacarte-bn \
locale-alacarte-bn-IN \
locale-alacarte-br \
locale-alacarte-bs \
locale-alacarte-ca \
locale-alacarte-ca@valencia \
locale-alacarte-cs \
locale-alacarte-cy \
locale-alacarte-da \
locale-alacarte-de \
locale-alacarte-dz \
locale-alacarte-el \
locale-alacarte-en-CA \
locale-alacarte-en-GB \
locale-alacarte-en@shaw \
locale-alacarte-eo \
locale-alacarte-es \
locale-alacarte-et \
locale-alacarte-eu \
locale-alacarte-fa \
locale-alacarte-fi \
locale-alacarte-fr \
locale-alacarte-fur \
locale-alacarte-ga \
locale-alacarte-gl \
locale-alacarte-gu \
locale-alacarte-he \
locale-alacarte-hi \
locale-alacarte-hr \
locale-alacarte-hu \
locale-alacarte-id \
locale-alacarte-it \
locale-alacarte-ja \
locale-alacarte-ka \
locale-alacarte-kk \
locale-alacarte-km \
locale-alacarte-kn \
locale-alacarte-ko \
locale-alacarte-lt \
locale-alacarte-lv \
locale-alacarte-mai \
locale-alacarte-mk \
locale-alacarte-ml \
locale-alacarte-mr \
locale-alacarte-ms \
locale-alacarte-nb \
locale-alacarte-nds \
locale-alacarte-nl \
locale-alacarte-nn \
locale-alacarte-oc \
locale-alacarte-or \
locale-alacarte-pa \
locale-alacarte-pl \
locale-alacarte-pt \
locale-alacarte-pt-BR \
locale-alacarte-ro \
locale-alacarte-ru \
locale-alacarte-si \
locale-alacarte-sk \
locale-alacarte-sl \
locale-alacarte-sq \
locale-alacarte-sr \
locale-alacarte-sr@latin \
locale-alacarte-sv \
locale-alacarte-ta \
locale-alacarte-te \
locale-alacarte-th \
locale-alacarte-tr \
locale-alacarte-ug \
locale-alacarte-uk \
locale-alacarte-vi \
locale-alacarte-zh-CN \
locale-alacarte-zh-HK \
locale-alacarte-zh-TW"

RDEPENDS:${PN} += "alacarte"

inherit rpm
