SUMMARY = "Translations for package kservice"
DESCRIPTION = "Provides translations for the 'kservice' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kservice-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "db77e596d25b1908c3c65727ef967dd8949c7d66212fc08e56256e4e9a6c2e5633f5737093ea243460da8cf7737469c6555f03a46e78c4b4cce5e9bf5789e97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kservice-lang \
kservice-lang-all \
locale-kservice-af \
locale-kservice-ar \
locale-kservice-as \
locale-kservice-az \
locale-kservice-be \
locale-kservice-be@latin \
locale-kservice-bg \
locale-kservice-bn \
locale-kservice-bn-IN \
locale-kservice-br \
locale-kservice-bs \
locale-kservice-ca \
locale-kservice-ca@valencia \
locale-kservice-cs \
locale-kservice-cy \
locale-kservice-da \
locale-kservice-de \
locale-kservice-el \
locale-kservice-en-GB \
locale-kservice-eo \
locale-kservice-es \
locale-kservice-et \
locale-kservice-eu \
locale-kservice-fa \
locale-kservice-fi \
locale-kservice-fr \
locale-kservice-ga \
locale-kservice-gd \
locale-kservice-gl \
locale-kservice-gu \
locale-kservice-he \
locale-kservice-hi \
locale-kservice-hr \
locale-kservice-hu \
locale-kservice-ia \
locale-kservice-id \
locale-kservice-is \
locale-kservice-it \
locale-kservice-ja \
locale-kservice-ka \
locale-kservice-kk \
locale-kservice-km \
locale-kservice-kn \
locale-kservice-ko \
locale-kservice-lt \
locale-kservice-lv \
locale-kservice-mai \
locale-kservice-mk \
locale-kservice-ml \
locale-kservice-mr \
locale-kservice-ms \
locale-kservice-nb \
locale-kservice-nds \
locale-kservice-ne \
locale-kservice-nl \
locale-kservice-nn \
locale-kservice-oc \
locale-kservice-or \
locale-kservice-pa \
locale-kservice-pl \
locale-kservice-pt \
locale-kservice-pt-BR \
locale-kservice-ro \
locale-kservice-ru \
locale-kservice-si \
locale-kservice-sk \
locale-kservice-sl \
locale-kservice-sq \
locale-kservice-sr \
locale-kservice-sr@ijekavian \
locale-kservice-sr@ijekavianlatin \
locale-kservice-sr@latin \
locale-kservice-sv \
locale-kservice-ta \
locale-kservice-te \
locale-kservice-th \
locale-kservice-tr \
locale-kservice-ug \
locale-kservice-uk \
locale-kservice-vi \
locale-kservice-wa \
locale-kservice-zh-CN \
locale-kservice-zh-HK \
locale-kservice-zh-TW"

RDEPENDS:${PN} += "kservice"

inherit rpm
