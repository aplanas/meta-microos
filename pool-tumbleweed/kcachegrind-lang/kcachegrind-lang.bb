SUMMARY = "Translations for package kcachegrind"
DESCRIPTION = "Provides translations for the 'kcachegrind' package."
LICENSE = "GPL-2.0-only & BSD-4-Clause & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kcachegrind-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "f7c9e03b47ddee3875bfb8ba9d714201cd3c0f9e9e6345c951c9262df8ca0888c7f35a61284831aa185e9d4758c489ceca6e4cdf633eb546f1b330e15426d4bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcachegrind-lang \
kcachegrind-lang-all \
locale-kcachegrind-ar \
locale-kcachegrind-be \
locale-kcachegrind-bg \
locale-kcachegrind-br \
locale-kcachegrind-bs \
locale-kcachegrind-ca \
locale-kcachegrind-ca@valencia \
locale-kcachegrind-cs \
locale-kcachegrind-cy \
locale-kcachegrind-da \
locale-kcachegrind-de \
locale-kcachegrind-el \
locale-kcachegrind-en \
locale-kcachegrind-en-GB \
locale-kcachegrind-eo \
locale-kcachegrind-es \
locale-kcachegrind-et \
locale-kcachegrind-eu \
locale-kcachegrind-fa \
locale-kcachegrind-fi \
locale-kcachegrind-fr \
locale-kcachegrind-ga \
locale-kcachegrind-gl \
locale-kcachegrind-hi \
locale-kcachegrind-hr \
locale-kcachegrind-hu \
locale-kcachegrind-it \
locale-kcachegrind-ja \
locale-kcachegrind-ka \
locale-kcachegrind-kk \
locale-kcachegrind-km \
locale-kcachegrind-ko \
locale-kcachegrind-lt \
locale-kcachegrind-mai \
locale-kcachegrind-mr \
locale-kcachegrind-ms \
locale-kcachegrind-nb \
locale-kcachegrind-nds \
locale-kcachegrind-ne \
locale-kcachegrind-nl \
locale-kcachegrind-nn \
locale-kcachegrind-oc \
locale-kcachegrind-pa \
locale-kcachegrind-pl \
locale-kcachegrind-pt \
locale-kcachegrind-pt-BR \
locale-kcachegrind-ro \
locale-kcachegrind-ru \
locale-kcachegrind-sk \
locale-kcachegrind-sl \
locale-kcachegrind-sq \
locale-kcachegrind-sv \
locale-kcachegrind-ta \
locale-kcachegrind-tr \
locale-kcachegrind-ug \
locale-kcachegrind-uk \
locale-kcachegrind-zh-CN \
locale-kcachegrind-zh-TW"

RDEPENDS:${PN} += "kcachegrind"

inherit rpm
