SUMMARY = "Translations for package khotkeys5"
DESCRIPTION = "Provides translations for the 'khotkeys5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "khotkeys5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "dbed35a06f821b35f545041a957ab09c94fd8c2594fcfddfeaadd3a9742193a78e558429d7916d5355287446d1b4cff95ccef1f3a36a461772deec9d66aadd2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "khotkeys5-lang \
khotkeys5-lang-all \
locale-khotkeys5-af \
locale-khotkeys5-ar \
locale-khotkeys5-be \
locale-khotkeys5-bg \
locale-khotkeys5-bn-IN \
locale-khotkeys5-br \
locale-khotkeys5-bs \
locale-khotkeys5-ca \
locale-khotkeys5-ca@valencia \
locale-khotkeys5-cs \
locale-khotkeys5-cy \
locale-khotkeys5-da \
locale-khotkeys5-de \
locale-khotkeys5-el \
locale-khotkeys5-en-GB \
locale-khotkeys5-eo \
locale-khotkeys5-es \
locale-khotkeys5-et \
locale-khotkeys5-eu \
locale-khotkeys5-fa \
locale-khotkeys5-fi \
locale-khotkeys5-fr \
locale-khotkeys5-ga \
locale-khotkeys5-gl \
locale-khotkeys5-gu \
locale-khotkeys5-he \
locale-khotkeys5-hi \
locale-khotkeys5-hr \
locale-khotkeys5-hu \
locale-khotkeys5-ia \
locale-khotkeys5-id \
locale-khotkeys5-is \
locale-khotkeys5-it \
locale-khotkeys5-ja \
locale-khotkeys5-ka \
locale-khotkeys5-kk \
locale-khotkeys5-km \
locale-khotkeys5-kn \
locale-khotkeys5-ko \
locale-khotkeys5-lt \
locale-khotkeys5-lv \
locale-khotkeys5-mai \
locale-khotkeys5-mk \
locale-khotkeys5-ml \
locale-khotkeys5-mr \
locale-khotkeys5-ms \
locale-khotkeys5-nb \
locale-khotkeys5-nds \
locale-khotkeys5-ne \
locale-khotkeys5-nl \
locale-khotkeys5-nn \
locale-khotkeys5-oc \
locale-khotkeys5-or \
locale-khotkeys5-pa \
locale-khotkeys5-pl \
locale-khotkeys5-pt \
locale-khotkeys5-pt-BR \
locale-khotkeys5-ro \
locale-khotkeys5-ru \
locale-khotkeys5-si \
locale-khotkeys5-sk \
locale-khotkeys5-sl \
locale-khotkeys5-sq \
locale-khotkeys5-sr \
locale-khotkeys5-sr@ijekavian \
locale-khotkeys5-sr@ijekavianlatin \
locale-khotkeys5-sr@latin \
locale-khotkeys5-sv \
locale-khotkeys5-ta \
locale-khotkeys5-te \
locale-khotkeys5-th \
locale-khotkeys5-tr \
locale-khotkeys5-ug \
locale-khotkeys5-uk \
locale-khotkeys5-vi \
locale-khotkeys5-wa \
locale-khotkeys5-zh-CN \
locale-khotkeys5-zh-TW"

RDEPENDS:${PN} += "khotkeys5"

inherit rpm
