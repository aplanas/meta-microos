SUMMARY = "Translations for package kinit"
DESCRIPTION = "Provides translations for the 'kinit' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kinit-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "c4f7593084231046f9c59b9506f1437731706aefb07fa6c928eb95d86abf2e082a42f03b37a6f57b8c5c2c7301681bd98f1ce1246f89495bea15a208f5927044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kinit-lang \
kinit-lang-all \
locale-kinit-af \
locale-kinit-ar \
locale-kinit-as \
locale-kinit-az \
locale-kinit-be \
locale-kinit-be@latin \
locale-kinit-bg \
locale-kinit-bn \
locale-kinit-bn-IN \
locale-kinit-br \
locale-kinit-bs \
locale-kinit-ca \
locale-kinit-ca@valencia \
locale-kinit-cs \
locale-kinit-cy \
locale-kinit-da \
locale-kinit-de \
locale-kinit-el \
locale-kinit-en-GB \
locale-kinit-eo \
locale-kinit-es \
locale-kinit-et \
locale-kinit-eu \
locale-kinit-fa \
locale-kinit-fi \
locale-kinit-fr \
locale-kinit-ga \
locale-kinit-gd \
locale-kinit-gl \
locale-kinit-gu \
locale-kinit-he \
locale-kinit-hi \
locale-kinit-hr \
locale-kinit-hu \
locale-kinit-ia \
locale-kinit-id \
locale-kinit-is \
locale-kinit-it \
locale-kinit-ja \
locale-kinit-ka \
locale-kinit-kk \
locale-kinit-km \
locale-kinit-kn \
locale-kinit-ko \
locale-kinit-lt \
locale-kinit-lv \
locale-kinit-mai \
locale-kinit-mk \
locale-kinit-ml \
locale-kinit-mr \
locale-kinit-ms \
locale-kinit-nb \
locale-kinit-nds \
locale-kinit-ne \
locale-kinit-nl \
locale-kinit-nn \
locale-kinit-oc \
locale-kinit-or \
locale-kinit-pa \
locale-kinit-pl \
locale-kinit-pt \
locale-kinit-pt-BR \
locale-kinit-ro \
locale-kinit-ru \
locale-kinit-si \
locale-kinit-sk \
locale-kinit-sl \
locale-kinit-sq \
locale-kinit-sr \
locale-kinit-sr@ijekavian \
locale-kinit-sr@ijekavianlatin \
locale-kinit-sr@latin \
locale-kinit-sv \
locale-kinit-ta \
locale-kinit-te \
locale-kinit-th \
locale-kinit-tr \
locale-kinit-ug \
locale-kinit-uk \
locale-kinit-vi \
locale-kinit-wa \
locale-kinit-zh-CN \
locale-kinit-zh-HK \
locale-kinit-zh-TW"

RDEPENDS:${PN} += "kinit"

inherit rpm
