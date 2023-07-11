SUMMARY = "Translations for package krusader"
DESCRIPTION = "Provides translations for the 'krusader' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "krusader-lang-2.8.0-1.4.noarch.rpm"
RPM_HASH = "f093e69dd1f006bbcdd5558f3ab6fc40842001e6fe966d8b036687de7cca685f5e67a3b6642e5512de98bb485cf1ebdf2d54ab6205f6fd9b50380dd35b847731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krusader-lang \
krusader-lang-all \
locale-krusader-ar \
locale-krusader-ast \
locale-krusader-bg \
locale-krusader-bs \
locale-krusader-ca \
locale-krusader-ca@valencia \
locale-krusader-cs \
locale-krusader-da \
locale-krusader-de \
locale-krusader-el \
locale-krusader-en-GB \
locale-krusader-eo \
locale-krusader-es \
locale-krusader-et \
locale-krusader-eu \
locale-krusader-fi \
locale-krusader-fr \
locale-krusader-ga \
locale-krusader-gl \
locale-krusader-hr \
locale-krusader-hu \
locale-krusader-ia \
locale-krusader-it \
locale-krusader-ja \
locale-krusader-ka \
locale-krusader-ko \
locale-krusader-lt \
locale-krusader-mai \
locale-krusader-mr \
locale-krusader-nb \
locale-krusader-nds \
locale-krusader-nl \
locale-krusader-nn \
locale-krusader-pa \
locale-krusader-pl \
locale-krusader-pt \
locale-krusader-pt-BR \
locale-krusader-ro \
locale-krusader-ru \
locale-krusader-sk \
locale-krusader-sl \
locale-krusader-sr \
locale-krusader-sr@ijekavian \
locale-krusader-sr@ijekavianlatin \
locale-krusader-sr@latin \
locale-krusader-sv \
locale-krusader-tr \
locale-krusader-ug \
locale-krusader-uk \
locale-krusader-zh-CN \
locale-krusader-zh-TW"

RDEPENDS:${PN} += "krusader"

inherit rpm
