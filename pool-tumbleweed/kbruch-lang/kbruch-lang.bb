SUMMARY = "Translations for package kbruch"
DESCRIPTION = "Provides translations for the 'kbruch' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kbruch-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "f8cf420308c79198a826505d7792bb848605245a56bcf915eff74ba6c935e89860f587a2b3288b4e63095e9d5074a97cb212b3c022189324879b1a84e7a05d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbruch-lang \
kbruch-lang-all \
locale-kbruch-ar \
locale-kbruch-be \
locale-kbruch-bg \
locale-kbruch-bn \
locale-kbruch-br \
locale-kbruch-bs \
locale-kbruch-ca \
locale-kbruch-ca@valencia \
locale-kbruch-cs \
locale-kbruch-cy \
locale-kbruch-da \
locale-kbruch-de \
locale-kbruch-el \
locale-kbruch-en-GB \
locale-kbruch-eo \
locale-kbruch-es \
locale-kbruch-et \
locale-kbruch-eu \
locale-kbruch-fa \
locale-kbruch-fi \
locale-kbruch-fr \
locale-kbruch-ga \
locale-kbruch-gl \
locale-kbruch-he \
locale-kbruch-hi \
locale-kbruch-hr \
locale-kbruch-hu \
locale-kbruch-is \
locale-kbruch-it \
locale-kbruch-ja \
locale-kbruch-ka \
locale-kbruch-kk \
locale-kbruch-km \
locale-kbruch-ko \
locale-kbruch-lt \
locale-kbruch-lv \
locale-kbruch-mk \
locale-kbruch-ml \
locale-kbruch-mr \
locale-kbruch-ms \
locale-kbruch-nb \
locale-kbruch-nds \
locale-kbruch-ne \
locale-kbruch-nl \
locale-kbruch-nn \
locale-kbruch-oc \
locale-kbruch-pa \
locale-kbruch-pl \
locale-kbruch-pt \
locale-kbruch-pt-BR \
locale-kbruch-ro \
locale-kbruch-ru \
locale-kbruch-si \
locale-kbruch-sk \
locale-kbruch-sl \
locale-kbruch-sq \
locale-kbruch-sv \
locale-kbruch-ta \
locale-kbruch-th \
locale-kbruch-tr \
locale-kbruch-ug \
locale-kbruch-uk \
locale-kbruch-zh-CN \
locale-kbruch-zh-TW"

RDEPENDS:${PN} += "kbruch"

inherit rpm
