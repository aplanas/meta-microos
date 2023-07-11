SUMMARY = "Translations for package kcharselect"
DESCRIPTION = "Provides translations for the 'kcharselect' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kcharselect-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "5fd60cf455aaf7618aa32dc983e89a6b3632c87761dc1544a9b242ea76aa1a9cbea9e1991af8334c42af2e55944c7ea9b15753135887e91b5defa0ddedfb1f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcharselect-lang \
kcharselect-lang-all \
locale-kcharselect-af \
locale-kcharselect-ar \
locale-kcharselect-be \
locale-kcharselect-bg \
locale-kcharselect-br \
locale-kcharselect-bs \
locale-kcharselect-ca \
locale-kcharselect-ca@valencia \
locale-kcharselect-cs \
locale-kcharselect-cy \
locale-kcharselect-da \
locale-kcharselect-de \
locale-kcharselect-el \
locale-kcharselect-en-GB \
locale-kcharselect-eo \
locale-kcharselect-es \
locale-kcharselect-et \
locale-kcharselect-eu \
locale-kcharselect-fa \
locale-kcharselect-fi \
locale-kcharselect-fr \
locale-kcharselect-ga \
locale-kcharselect-gl \
locale-kcharselect-he \
locale-kcharselect-hi \
locale-kcharselect-hr \
locale-kcharselect-hu \
locale-kcharselect-ia \
locale-kcharselect-id \
locale-kcharselect-is \
locale-kcharselect-it \
locale-kcharselect-ja \
locale-kcharselect-ka \
locale-kcharselect-kk \
locale-kcharselect-km \
locale-kcharselect-ko \
locale-kcharselect-lt \
locale-kcharselect-lv \
locale-kcharselect-mk \
locale-kcharselect-mr \
locale-kcharselect-ms \
locale-kcharselect-nb \
locale-kcharselect-nds \
locale-kcharselect-ne \
locale-kcharselect-nl \
locale-kcharselect-nn \
locale-kcharselect-oc \
locale-kcharselect-pa \
locale-kcharselect-pl \
locale-kcharselect-pt \
locale-kcharselect-pt-BR \
locale-kcharselect-ro \
locale-kcharselect-ru \
locale-kcharselect-si \
locale-kcharselect-sk \
locale-kcharselect-sl \
locale-kcharselect-sq \
locale-kcharselect-sr \
locale-kcharselect-sr@ijekavian \
locale-kcharselect-sr@ijekavianlatin \
locale-kcharselect-sr@latin \
locale-kcharselect-sv \
locale-kcharselect-ta \
locale-kcharselect-th \
locale-kcharselect-tr \
locale-kcharselect-ug \
locale-kcharselect-uk \
locale-kcharselect-zh-CN \
locale-kcharselect-zh-TW"

RDEPENDS:${PN} += "kcharselect"

inherit rpm
