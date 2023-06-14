SUMMARY = "Translations for package kdnssd"
DESCRIPTION = "Provides translations for the 'kdnssd' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdnssd-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "091e2d164cc329a35a688947155812da3bbab8b9c4fb226f2a0fce0d6add436d414d2331d3b1ff79f1213cb1415279ceec51852305f3464b85231f080b23eb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdnssd-lang \
kdnssd-lang-all \
locale-kdnssd-ar \
locale-kdnssd-be \
locale-kdnssd-bg \
locale-kdnssd-bn \
locale-kdnssd-br \
locale-kdnssd-bs \
locale-kdnssd-ca \
locale-kdnssd-ca@valencia \
locale-kdnssd-cs \
locale-kdnssd-cy \
locale-kdnssd-da \
locale-kdnssd-de \
locale-kdnssd-el \
locale-kdnssd-en-GB \
locale-kdnssd-eo \
locale-kdnssd-es \
locale-kdnssd-et \
locale-kdnssd-eu \
locale-kdnssd-fa \
locale-kdnssd-fi \
locale-kdnssd-fr \
locale-kdnssd-ga \
locale-kdnssd-gl \
locale-kdnssd-hi \
locale-kdnssd-hr \
locale-kdnssd-hu \
locale-kdnssd-ia \
locale-kdnssd-id \
locale-kdnssd-is \
locale-kdnssd-it \
locale-kdnssd-ja \
locale-kdnssd-ka \
locale-kdnssd-kk \
locale-kdnssd-km \
locale-kdnssd-ko \
locale-kdnssd-lt \
locale-kdnssd-lv \
locale-kdnssd-mk \
locale-kdnssd-ml \
locale-kdnssd-mr \
locale-kdnssd-ms \
locale-kdnssd-nb \
locale-kdnssd-nds \
locale-kdnssd-ne \
locale-kdnssd-nl \
locale-kdnssd-nn \
locale-kdnssd-oc \
locale-kdnssd-pa \
locale-kdnssd-pl \
locale-kdnssd-pt \
locale-kdnssd-pt-BR \
locale-kdnssd-ro \
locale-kdnssd-ru \
locale-kdnssd-sk \
locale-kdnssd-sl \
locale-kdnssd-sq \
locale-kdnssd-sr \
locale-kdnssd-sr@ijekavian \
locale-kdnssd-sr@ijekavianlatin \
locale-kdnssd-sr@latin \
locale-kdnssd-sv \
locale-kdnssd-ta \
locale-kdnssd-th \
locale-kdnssd-tr \
locale-kdnssd-ug \
locale-kdnssd-uk \
locale-kdnssd-vi \
locale-kdnssd-zh-CN \
locale-kdnssd-zh-HK \
locale-kdnssd-zh-TW"

RDEPENDS:${PN} += "kdnssd"

inherit rpm
