SUMMARY = "Translations for package analitza"
DESCRIPTION = "Provides translations for the 'analitza' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "analitza-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "b531f6a4c46f5b0a5c6858d70f51de88da470055572d02db7bf69536bb400439918ab4ffa902b62a4e2881c42ffc9eb36e9d20190398017d8ca6697545f9cf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analitza-lang \
analitza-lang-all \
locale-analitza-ar \
locale-analitza-bs \
locale-analitza-ca \
locale-analitza-ca@valencia \
locale-analitza-cs \
locale-analitza-da \
locale-analitza-de \
locale-analitza-el \
locale-analitza-en-GB \
locale-analitza-es \
locale-analitza-et \
locale-analitza-eu \
locale-analitza-fi \
locale-analitza-fr \
locale-analitza-ga \
locale-analitza-gl \
locale-analitza-hu \
locale-analitza-ia \
locale-analitza-it \
locale-analitza-ja \
locale-analitza-ka \
locale-analitza-kk \
locale-analitza-ko \
locale-analitza-lt \
locale-analitza-lv \
locale-analitza-ml \
locale-analitza-mr \
locale-analitza-nb \
locale-analitza-nds \
locale-analitza-nl \
locale-analitza-nn \
locale-analitza-pl \
locale-analitza-pt \
locale-analitza-pt-BR \
locale-analitza-ru \
locale-analitza-sk \
locale-analitza-sl \
locale-analitza-sv \
locale-analitza-tr \
locale-analitza-ug \
locale-analitza-uk \
locale-analitza-zh-CN \
locale-analitza-zh-TW"

RDEPENDS:${PN} += "analitza"

inherit rpm
