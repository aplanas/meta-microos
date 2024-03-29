SUMMARY = "Translations for package eog"
DESCRIPTION = "Provides translations for the 'eog' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.3"

RPM_NAME = "eog-lang-44.3-1.1.noarch.rpm"
RPM_HASH = "56732a7e5aead761fa8853203bb45d23311a581d817659377f2dfcaa33579ba590c73d843d088115db79980c9174a8a1399c0f5c5553896ca6cc5bcf1ceb00c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-lang \
eog-lang-all \
locale-eog-af \
locale-eog-ar \
locale-eog-as \
locale-eog-ast \
locale-eog-az \
locale-eog-be \
locale-eog-be@latin \
locale-eog-bg \
locale-eog-bn \
locale-eog-bn-IN \
locale-eog-br \
locale-eog-bs \
locale-eog-ca \
locale-eog-ca@valencia \
locale-eog-cs \
locale-eog-cy \
locale-eog-da \
locale-eog-de \
locale-eog-dz \
locale-eog-el \
locale-eog-en-CA \
locale-eog-en-GB \
locale-eog-en@shaw \
locale-eog-eo \
locale-eog-es \
locale-eog-et \
locale-eog-eu \
locale-eog-fa \
locale-eog-fi \
locale-eog-fr \
locale-eog-fur \
locale-eog-ga \
locale-eog-gd \
locale-eog-gl \
locale-eog-gu \
locale-eog-he \
locale-eog-hi \
locale-eog-hr \
locale-eog-hu \
locale-eog-id \
locale-eog-is \
locale-eog-it \
locale-eog-ja \
locale-eog-ka \
locale-eog-kk \
locale-eog-km \
locale-eog-kn \
locale-eog-ko \
locale-eog-lt \
locale-eog-lv \
locale-eog-mai \
locale-eog-mk \
locale-eog-ml \
locale-eog-mr \
locale-eog-ms \
locale-eog-nb \
locale-eog-nds \
locale-eog-ne \
locale-eog-nl \
locale-eog-nn \
locale-eog-oc \
locale-eog-or \
locale-eog-pa \
locale-eog-pl \
locale-eog-pt \
locale-eog-pt-BR \
locale-eog-ro \
locale-eog-ru \
locale-eog-si \
locale-eog-sk \
locale-eog-sl \
locale-eog-sq \
locale-eog-sr \
locale-eog-sr@latin \
locale-eog-sv \
locale-eog-ta \
locale-eog-te \
locale-eog-th \
locale-eog-tr \
locale-eog-ug \
locale-eog-uk \
locale-eog-vi \
locale-eog-wa \
locale-eog-zh-CN \
locale-eog-zh-HK \
locale-eog-zh-TW"

RDEPENDS:${PN} += "eog"

inherit rpm
