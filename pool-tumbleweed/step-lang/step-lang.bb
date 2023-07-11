SUMMARY = "Translations for package step"
DESCRIPTION = "Provides translations for the 'step' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "step-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "fa7d0cc83d103706577550a6887c40c2e12c42e9574779df30d3d68ebbb67f318241e7b258e8563afbd6c787b1c4f5f1dc4d652343ebbbf193011b852219027c"
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
