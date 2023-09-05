SUMMARY = "Translations for package kcharselect"
DESCRIPTION = "Provides translations for the 'kcharselect' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kcharselect-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "506efef80f1b7a146a61315d360bb1540239d2547631c9846960439d91cff79dd4163961bffe993d8aac2ca5ff76afc6e18da0d52d23a6cc305173e4ead70f92"
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
