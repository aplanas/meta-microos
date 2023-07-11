SUMMARY = "Translations for package kdiamond"
DESCRIPTION = "Provides translations for the 'kdiamond' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdiamond-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "c371e4574132ae2bed5e16852ffda8305759843fc0e564e3d95b782bc121ad5a69dc5b82ee027569f4113fb0dbeae8a651eef3a29ec68e14afe0f263e53bcc7c"
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
