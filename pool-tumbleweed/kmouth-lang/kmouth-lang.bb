SUMMARY = "Translations for package kmouth"
DESCRIPTION = "Provides translations for the 'kmouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmouth-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "ce2a4eb1614aff936a96e3d68255b5cc007efd3362a598a43ba646caa95c1f35edab99a19c4993e483383f5b802a3d5e7658368133d0a51c37b0ad0feb29e700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmouth-lang \
kmouth-lang-all \
locale-kmouth-ar \
locale-kmouth-be \
locale-kmouth-bg \
locale-kmouth-br \
locale-kmouth-bs \
locale-kmouth-ca \
locale-kmouth-ca@valencia \
locale-kmouth-cs \
locale-kmouth-cy \
locale-kmouth-da \
locale-kmouth-de \
locale-kmouth-el \
locale-kmouth-en-GB \
locale-kmouth-eo \
locale-kmouth-es \
locale-kmouth-et \
locale-kmouth-eu \
locale-kmouth-fa \
locale-kmouth-fi \
locale-kmouth-fr \
locale-kmouth-ga \
locale-kmouth-gl \
locale-kmouth-he \
locale-kmouth-hi \
locale-kmouth-hr \
locale-kmouth-hu \
locale-kmouth-ia \
locale-kmouth-is \
locale-kmouth-it \
locale-kmouth-ja \
locale-kmouth-ka \
locale-kmouth-kk \
locale-kmouth-km \
locale-kmouth-ko \
locale-kmouth-lt \
locale-kmouth-lv \
locale-kmouth-mai \
locale-kmouth-mk \
locale-kmouth-ml \
locale-kmouth-mr \
locale-kmouth-ms \
locale-kmouth-nb \
locale-kmouth-nds \
locale-kmouth-ne \
locale-kmouth-nl \
locale-kmouth-nn \
locale-kmouth-oc \
locale-kmouth-pa \
locale-kmouth-pl \
locale-kmouth-pt \
locale-kmouth-pt-BR \
locale-kmouth-ro \
locale-kmouth-ru \
locale-kmouth-sk \
locale-kmouth-sl \
locale-kmouth-sq \
locale-kmouth-sr \
locale-kmouth-sr@ijekavian \
locale-kmouth-sr@ijekavianlatin \
locale-kmouth-sr@latin \
locale-kmouth-sv \
locale-kmouth-ta \
locale-kmouth-th \
locale-kmouth-tr \
locale-kmouth-ug \
locale-kmouth-uk \
locale-kmouth-vi \
locale-kmouth-zh-CN \
locale-kmouth-zh-TW"

RDEPENDS:${PN} += "kmouth"

inherit rpm
