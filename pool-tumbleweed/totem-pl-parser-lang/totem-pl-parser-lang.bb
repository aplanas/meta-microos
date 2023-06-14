SUMMARY = "Translations for package totem-pl-parser"
DESCRIPTION = "Provides translations for the 'totem-pl-parser' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "totem-pl-parser-lang-3.26.6-2.8.noarch.rpm"
RPM_HASH = "383bb14d9a68713eef937807ec1a4eb3c28a30097d855778dcf448e8a1c68dc6c95f8b46137047be49d1a69e714bee1761fa6f8f8c1f09310ef0efbab4411c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-totem-pl-parser-af \
locale-totem-pl-parser-ar \
locale-totem-pl-parser-as \
locale-totem-pl-parser-ast \
locale-totem-pl-parser-az \
locale-totem-pl-parser-be \
locale-totem-pl-parser-be@latin \
locale-totem-pl-parser-bg \
locale-totem-pl-parser-bn \
locale-totem-pl-parser-bn-IN \
locale-totem-pl-parser-bs \
locale-totem-pl-parser-ca \
locale-totem-pl-parser-ca@valencia \
locale-totem-pl-parser-cs \
locale-totem-pl-parser-cy \
locale-totem-pl-parser-da \
locale-totem-pl-parser-de \
locale-totem-pl-parser-dz \
locale-totem-pl-parser-el \
locale-totem-pl-parser-en-CA \
locale-totem-pl-parser-en-GB \
locale-totem-pl-parser-en@shaw \
locale-totem-pl-parser-eo \
locale-totem-pl-parser-es \
locale-totem-pl-parser-et \
locale-totem-pl-parser-eu \
locale-totem-pl-parser-fa \
locale-totem-pl-parser-fi \
locale-totem-pl-parser-fr \
locale-totem-pl-parser-fur \
locale-totem-pl-parser-ga \
locale-totem-pl-parser-gd \
locale-totem-pl-parser-gl \
locale-totem-pl-parser-gu \
locale-totem-pl-parser-he \
locale-totem-pl-parser-hi \
locale-totem-pl-parser-hr \
locale-totem-pl-parser-hu \
locale-totem-pl-parser-id \
locale-totem-pl-parser-is \
locale-totem-pl-parser-it \
locale-totem-pl-parser-ja \
locale-totem-pl-parser-ka \
locale-totem-pl-parser-kk \
locale-totem-pl-parser-km \
locale-totem-pl-parser-kn \
locale-totem-pl-parser-ko \
locale-totem-pl-parser-lt \
locale-totem-pl-parser-lv \
locale-totem-pl-parser-mai \
locale-totem-pl-parser-mk \
locale-totem-pl-parser-ml \
locale-totem-pl-parser-mr \
locale-totem-pl-parser-ms \
locale-totem-pl-parser-nb \
locale-totem-pl-parser-nds \
locale-totem-pl-parser-ne \
locale-totem-pl-parser-nl \
locale-totem-pl-parser-nn \
locale-totem-pl-parser-oc \
locale-totem-pl-parser-or \
locale-totem-pl-parser-pa \
locale-totem-pl-parser-pl \
locale-totem-pl-parser-pt \
locale-totem-pl-parser-pt-BR \
locale-totem-pl-parser-ro \
locale-totem-pl-parser-ru \
locale-totem-pl-parser-si \
locale-totem-pl-parser-sk \
locale-totem-pl-parser-sl \
locale-totem-pl-parser-sq \
locale-totem-pl-parser-sr \
locale-totem-pl-parser-sr@latin \
locale-totem-pl-parser-sv \
locale-totem-pl-parser-ta \
locale-totem-pl-parser-te \
locale-totem-pl-parser-th \
locale-totem-pl-parser-tr \
locale-totem-pl-parser-ug \
locale-totem-pl-parser-uk \
locale-totem-pl-parser-vi \
locale-totem-pl-parser-wa \
locale-totem-pl-parser-zh-CN \
locale-totem-pl-parser-zh-HK \
locale-totem-pl-parser-zh-TW \
totem-pl-parser-lang \
totem-pl-parser-lang-all"

RDEPENDS:${PN} += "totem-pl-parser"

inherit rpm
