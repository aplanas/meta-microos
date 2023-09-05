SUMMARY = "Translations for package messagelib"
DESCRIPTION = "Provides translations for the 'messagelib' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "messagelib-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "fda5ed3e2717fcb064947c4f522616ccfe655ebb681ad3cb7586df100a13f4fac23a89596bcf0955004518e4ffdbda640ed910786a8a4eec3caae50d6d3af5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-messagelib-af \
locale-messagelib-ar \
locale-messagelib-be \
locale-messagelib-bg \
locale-messagelib-bn \
locale-messagelib-br \
locale-messagelib-bs \
locale-messagelib-ca \
locale-messagelib-ca@valencia \
locale-messagelib-cs \
locale-messagelib-cy \
locale-messagelib-da \
locale-messagelib-de \
locale-messagelib-el \
locale-messagelib-en-GB \
locale-messagelib-eo \
locale-messagelib-es \
locale-messagelib-et \
locale-messagelib-eu \
locale-messagelib-fa \
locale-messagelib-fi \
locale-messagelib-fr \
locale-messagelib-ga \
locale-messagelib-gl \
locale-messagelib-he \
locale-messagelib-hi \
locale-messagelib-hr \
locale-messagelib-hu \
locale-messagelib-ia \
locale-messagelib-is \
locale-messagelib-it \
locale-messagelib-ja \
locale-messagelib-ka \
locale-messagelib-kk \
locale-messagelib-km \
locale-messagelib-ko \
locale-messagelib-lt \
locale-messagelib-lv \
locale-messagelib-mai \
locale-messagelib-mk \
locale-messagelib-mr \
locale-messagelib-ms \
locale-messagelib-nb \
locale-messagelib-nds \
locale-messagelib-ne \
locale-messagelib-nl \
locale-messagelib-nn \
locale-messagelib-pa \
locale-messagelib-pl \
locale-messagelib-pt \
locale-messagelib-pt-BR \
locale-messagelib-ro \
locale-messagelib-ru \
locale-messagelib-sk \
locale-messagelib-sl \
locale-messagelib-sr \
locale-messagelib-sr@ijekavian \
locale-messagelib-sr@ijekavianlatin \
locale-messagelib-sr@latin \
locale-messagelib-sv \
locale-messagelib-ta \
locale-messagelib-th \
locale-messagelib-tr \
locale-messagelib-ug \
locale-messagelib-uk \
locale-messagelib-wa \
locale-messagelib-zh-CN \
locale-messagelib-zh-TW \
messagelib-lang \
messagelib-lang-all"

RDEPENDS:${PN} += "messagelib"

inherit rpm
