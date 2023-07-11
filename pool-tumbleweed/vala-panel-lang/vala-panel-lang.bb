SUMMARY = "Translations for package vala-panel"
DESCRIPTION = "Provides translations for the 'vala-panel' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-lang-0.5.0-1.7.noarch.rpm"
RPM_HASH = "d092d4dc27a486565f0cbeda9ba6e3639f8bbfe2baea0da1ab555c087493a3e817dc63541d5b2bfcd047691ce10b9b6ff4caf47ad429d65214969b77452734e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vala-panel-af \
locale-vala-panel-ar \
locale-vala-panel-as \
locale-vala-panel-ast \
locale-vala-panel-az \
locale-vala-panel-be \
locale-vala-panel-bg \
locale-vala-panel-bn \
locale-vala-panel-br \
locale-vala-panel-bs \
locale-vala-panel-ca \
locale-vala-panel-cs \
locale-vala-panel-cy \
locale-vala-panel-da \
locale-vala-panel-de \
locale-vala-panel-dz \
locale-vala-panel-el \
locale-vala-panel-en-AU \
locale-vala-panel-en-CA \
locale-vala-panel-en-GB \
locale-vala-panel-eo \
locale-vala-panel-es \
locale-vala-panel-et \
locale-vala-panel-eu \
locale-vala-panel-fa \
locale-vala-panel-fi \
locale-vala-panel-fr \
locale-vala-panel-fr-CA \
locale-vala-panel-ga \
locale-vala-panel-gd \
locale-vala-panel-gl \
locale-vala-panel-gu \
locale-vala-panel-he \
locale-vala-panel-hi \
locale-vala-panel-hr \
locale-vala-panel-hu \
locale-vala-panel-ia \
locale-vala-panel-id \
locale-vala-panel-is \
locale-vala-panel-it \
locale-vala-panel-ja \
locale-vala-panel-ka \
locale-vala-panel-kk \
locale-vala-panel-km \
locale-vala-panel-kn \
locale-vala-panel-ko \
locale-vala-panel-lt \
locale-vala-panel-lv \
locale-vala-panel-mk \
locale-vala-panel-ml \
locale-vala-panel-mr \
locale-vala-panel-ms \
locale-vala-panel-nb \
locale-vala-panel-ne \
locale-vala-panel-nl \
locale-vala-panel-nn \
locale-vala-panel-oc \
locale-vala-panel-or \
locale-vala-panel-pa \
locale-vala-panel-pl \
locale-vala-panel-pt \
locale-vala-panel-pt-BR \
locale-vala-panel-ro \
locale-vala-panel-ru \
locale-vala-panel-si \
locale-vala-panel-sk \
locale-vala-panel-sl \
locale-vala-panel-sq \
locale-vala-panel-sr \
locale-vala-panel-sv \
locale-vala-panel-ta \
locale-vala-panel-te \
locale-vala-panel-th \
locale-vala-panel-tr \
locale-vala-panel-ug \
locale-vala-panel-uk \
locale-vala-panel-vi \
locale-vala-panel-wa \
locale-vala-panel-zh \
locale-vala-panel-zh-CN \
locale-vala-panel-zh-HK \
locale-vala-panel-zh-TW \
vala-panel-lang \
vala-panel-lang-all"

RDEPENDS:${PN} += "vala-panel"

inherit rpm
