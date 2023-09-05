SUMMARY = "Translations for package kdiamond"
DESCRIPTION = "Provides translations for the 'kdiamond' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdiamond-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "69e89143db287299658f09bd13585e8d3643dfdac02900520ced0d6d0b31d3ee239b313857d1214c4d0cdc0ace34cf8e854fdcb6b1c7826e6394dc1098923dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdiamond-lang \
kdiamond-lang-all \
locale-kdiamond-ar \
locale-kdiamond-bg \
locale-kdiamond-bs \
locale-kdiamond-ca \
locale-kdiamond-ca@valencia \
locale-kdiamond-cs \
locale-kdiamond-da \
locale-kdiamond-de \
locale-kdiamond-el \
locale-kdiamond-en-GB \
locale-kdiamond-eo \
locale-kdiamond-es \
locale-kdiamond-et \
locale-kdiamond-eu \
locale-kdiamond-fi \
locale-kdiamond-fr \
locale-kdiamond-ga \
locale-kdiamond-gl \
locale-kdiamond-gu \
locale-kdiamond-hi \
locale-kdiamond-hr \
locale-kdiamond-hu \
locale-kdiamond-id \
locale-kdiamond-is \
locale-kdiamond-it \
locale-kdiamond-ja \
locale-kdiamond-ka \
locale-kdiamond-kk \
locale-kdiamond-km \
locale-kdiamond-ko \
locale-kdiamond-lt \
locale-kdiamond-lv \
locale-kdiamond-mai \
locale-kdiamond-ml \
locale-kdiamond-mr \
locale-kdiamond-nb \
locale-kdiamond-nds \
locale-kdiamond-nl \
locale-kdiamond-nn \
locale-kdiamond-pl \
locale-kdiamond-pt \
locale-kdiamond-pt-BR \
locale-kdiamond-ro \
locale-kdiamond-ru \
locale-kdiamond-sk \
locale-kdiamond-sl \
locale-kdiamond-sq \
locale-kdiamond-sr \
locale-kdiamond-sr@ijekavian \
locale-kdiamond-sr@ijekavianlatin \
locale-kdiamond-sr@latin \
locale-kdiamond-sv \
locale-kdiamond-th \
locale-kdiamond-tr \
locale-kdiamond-ug \
locale-kdiamond-uk \
locale-kdiamond-zh-CN \
locale-kdiamond-zh-TW"

RDEPENDS:${PN} += "kdiamond"

inherit rpm
