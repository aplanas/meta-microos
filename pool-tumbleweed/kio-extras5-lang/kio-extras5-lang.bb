SUMMARY = "Translations for package kio-extras5"
DESCRIPTION = "Provides translations for the 'kio-extras5' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kio-extras5-lang-23.04.1-2.1.noarch.rpm"
RPM_HASH = "31d6b90f0272a3dd046981c333085d75053abef064521109c7fba921f8bae31ce368c2cb7d2983550b5217c768569d4a21f59aaf9026d0566161214b6431281f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-extras5-lang \
kio-extras5-lang-all \
locale-kio-extras5-af \
locale-kio-extras5-ar \
locale-kio-extras5-be \
locale-kio-extras5-be@latin \
locale-kio-extras5-bg \
locale-kio-extras5-bn \
locale-kio-extras5-bn-IN \
locale-kio-extras5-br \
locale-kio-extras5-bs \
locale-kio-extras5-ca \
locale-kio-extras5-ca@valencia \
locale-kio-extras5-cs \
locale-kio-extras5-cy \
locale-kio-extras5-da \
locale-kio-extras5-de \
locale-kio-extras5-el \
locale-kio-extras5-en-GB \
locale-kio-extras5-eo \
locale-kio-extras5-es \
locale-kio-extras5-et \
locale-kio-extras5-eu \
locale-kio-extras5-fa \
locale-kio-extras5-fi \
locale-kio-extras5-fr \
locale-kio-extras5-ga \
locale-kio-extras5-gd \
locale-kio-extras5-gl \
locale-kio-extras5-gu \
locale-kio-extras5-he \
locale-kio-extras5-hi \
locale-kio-extras5-hr \
locale-kio-extras5-hu \
locale-kio-extras5-ia \
locale-kio-extras5-id \
locale-kio-extras5-is \
locale-kio-extras5-it \
locale-kio-extras5-ja \
locale-kio-extras5-ka \
locale-kio-extras5-kk \
locale-kio-extras5-km \
locale-kio-extras5-kn \
locale-kio-extras5-ko \
locale-kio-extras5-lt \
locale-kio-extras5-lv \
locale-kio-extras5-mai \
locale-kio-extras5-mk \
locale-kio-extras5-ml \
locale-kio-extras5-mr \
locale-kio-extras5-ms \
locale-kio-extras5-nb \
locale-kio-extras5-nds \
locale-kio-extras5-ne \
locale-kio-extras5-nl \
locale-kio-extras5-nn \
locale-kio-extras5-oc \
locale-kio-extras5-or \
locale-kio-extras5-pa \
locale-kio-extras5-pl \
locale-kio-extras5-pt \
locale-kio-extras5-pt-BR \
locale-kio-extras5-ro \
locale-kio-extras5-ru \
locale-kio-extras5-si \
locale-kio-extras5-sk \
locale-kio-extras5-sl \
locale-kio-extras5-sq \
locale-kio-extras5-sr \
locale-kio-extras5-sr@ijekavian \
locale-kio-extras5-sr@ijekavianlatin \
locale-kio-extras5-sr@latin \
locale-kio-extras5-sv \
locale-kio-extras5-ta \
locale-kio-extras5-te \
locale-kio-extras5-th \
locale-kio-extras5-tr \
locale-kio-extras5-ug \
locale-kio-extras5-uk \
locale-kio-extras5-vi \
locale-kio-extras5-wa \
locale-kio-extras5-zh-CN \
locale-kio-extras5-zh-HK \
locale-kio-extras5-zh-TW"

RDEPENDS:${PN} += "kio-extras5"

inherit rpm
