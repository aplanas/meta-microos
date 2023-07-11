SUMMARY = "Translations for package glabels"
DESCRIPTION = "Provides translations for the 'glabels' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "glabels-lang-3.4.1-4.13.noarch.rpm"
RPM_HASH = "bdf313deadadb311bb889851b426594d035ee47e93b76bf61a7055d060f60aa32ee5d30f558ee1f806d1ccedb7da4e036897b5a58454aada36111415397314b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glabels-lang \
glabels-lang-all \
locale-glabels-ar \
locale-glabels-bs \
locale-glabels-ca \
locale-glabels-ca@valencia \
locale-glabels-cs \
locale-glabels-da \
locale-glabels-de \
locale-glabels-el \
locale-glabels-en-GB \
locale-glabels-eo \
locale-glabels-es \
locale-glabels-fi \
locale-glabels-fr \
locale-glabels-gl \
locale-glabels-hu \
locale-glabels-id \
locale-glabels-it \
locale-glabels-ja \
locale-glabels-ko \
locale-glabels-lv \
locale-glabels-nb \
locale-glabels-nl \
locale-glabels-oc \
locale-glabels-pt \
locale-glabels-pt-BR \
locale-glabels-ro \
locale-glabels-ru \
locale-glabels-sk \
locale-glabels-sl \
locale-glabels-sr \
locale-glabels-sr@latin \
locale-glabels-sv \
locale-glabels-tr \
locale-glabels-zh-CN \
locale-glabels-zh-HK \
locale-glabels-zh-TW"

RDEPENDS:${PN} += "glabels"

inherit rpm
