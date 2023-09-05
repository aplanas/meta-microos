SUMMARY = "Translations for package step"
DESCRIPTION = "Provides translations for the 'step' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "step-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "804aca47a87fd23a5c360649fae8901eaa05f9e5ca4dce02ba4d2b3104f3e3c648af3cb9005c0e4ce01e6ce40f8c29c79d898c0283fe0b3e28b512cecfdc5a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-step-ar \
locale-step-be \
locale-step-bg \
locale-step-bs \
locale-step-ca \
locale-step-ca@valencia \
locale-step-cs \
locale-step-da \
locale-step-de \
locale-step-el \
locale-step-en-GB \
locale-step-eo \
locale-step-es \
locale-step-et \
locale-step-eu \
locale-step-fi \
locale-step-fr \
locale-step-ga \
locale-step-gl \
locale-step-gu \
locale-step-hr \
locale-step-hu \
locale-step-ia \
locale-step-it \
locale-step-ja \
locale-step-ka \
locale-step-kk \
locale-step-km \
locale-step-ko \
locale-step-lt \
locale-step-lv \
locale-step-mai \
locale-step-ml \
locale-step-mr \
locale-step-nb \
locale-step-nds \
locale-step-nl \
locale-step-nn \
locale-step-oc \
locale-step-pa \
locale-step-pl \
locale-step-pt \
locale-step-pt-BR \
locale-step-ro \
locale-step-ru \
locale-step-si \
locale-step-sk \
locale-step-sl \
locale-step-sq \
locale-step-sv \
locale-step-th \
locale-step-tr \
locale-step-ug \
locale-step-uk \
locale-step-zh-CN \
locale-step-zh-TW \
step-lang \
step-lang-all"

RDEPENDS:${PN} += "step"

inherit rpm
