SUMMARY = "Translation files for freeciv"
DESCRIPTION = "Translation files for freeciv main package and clients."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "freeciv-lang-3.0.8-1.1.noarch.rpm"
RPM_HASH = "a0bed1007146fc5f4d2d10b49816754bd22284d50609ca5f7b0b9dc444d3c5f1e39d7595367e6a65c2b68a9958330ee733cb2566c39d4bc456f40a6c093ffcd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freeciv-lang \
locale-freeciv-ar \
locale-freeciv-bg \
locale-freeciv-ca \
locale-freeciv-cs \
locale-freeciv-da \
locale-freeciv-de \
locale-freeciv-el \
locale-freeciv-en-GB \
locale-freeciv-eo \
locale-freeciv-es \
locale-freeciv-et \
locale-freeciv-fa \
locale-freeciv-fi \
locale-freeciv-fr \
locale-freeciv-ga \
locale-freeciv-gd \
locale-freeciv-he \
locale-freeciv-hu \
locale-freeciv-id \
locale-freeciv-it \
locale-freeciv-ja \
locale-freeciv-ko \
locale-freeciv-lt \
locale-freeciv-nb \
locale-freeciv-nl \
locale-freeciv-pl \
locale-freeciv-pt \
locale-freeciv-pt-BR \
locale-freeciv-ro \
locale-freeciv-ru \
locale-freeciv-sr \
locale-freeciv-sv \
locale-freeciv-tr \
locale-freeciv-uk \
locale-freeciv-zh-CN \
locale-freeciv-zh-TW"

RDEPENDS:${PN} += "freeciv"

inherit rpm
