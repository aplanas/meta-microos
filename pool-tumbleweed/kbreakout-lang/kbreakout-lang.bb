SUMMARY = "Translations for package kbreakout"
DESCRIPTION = "Provides translations for the 'kbreakout' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kbreakout-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "80c01fa82982bbfe666afd92bd148c31b0d3291951b1eb20155ad54ccbe9e9e80353993c00a7f5cec556962f8fc2fc8549429ec68374cdcb1cb5f08a9d58625f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbreakout-lang \
kbreakout-lang-all \
locale-kbreakout-ar \
locale-kbreakout-bg \
locale-kbreakout-bs \
locale-kbreakout-ca \
locale-kbreakout-ca@valencia \
locale-kbreakout-cs \
locale-kbreakout-da \
locale-kbreakout-de \
locale-kbreakout-el \
locale-kbreakout-en-GB \
locale-kbreakout-eo \
locale-kbreakout-es \
locale-kbreakout-et \
locale-kbreakout-eu \
locale-kbreakout-fi \
locale-kbreakout-fr \
locale-kbreakout-ga \
locale-kbreakout-gl \
locale-kbreakout-gu \
locale-kbreakout-hr \
locale-kbreakout-hu \
locale-kbreakout-id \
locale-kbreakout-is \
locale-kbreakout-it \
locale-kbreakout-ja \
locale-kbreakout-ka \
locale-kbreakout-kk \
locale-kbreakout-km \
locale-kbreakout-ko \
locale-kbreakout-lt \
locale-kbreakout-lv \
locale-kbreakout-mai \
locale-kbreakout-ml \
locale-kbreakout-mr \
locale-kbreakout-nb \
locale-kbreakout-nds \
locale-kbreakout-nl \
locale-kbreakout-nn \
locale-kbreakout-pl \
locale-kbreakout-pt \
locale-kbreakout-pt-BR \
locale-kbreakout-ro \
locale-kbreakout-ru \
locale-kbreakout-sk \
locale-kbreakout-sl \
locale-kbreakout-sq \
locale-kbreakout-sr \
locale-kbreakout-sr@ijekavian \
locale-kbreakout-sr@ijekavianlatin \
locale-kbreakout-sr@latin \
locale-kbreakout-sv \
locale-kbreakout-th \
locale-kbreakout-tr \
locale-kbreakout-ug \
locale-kbreakout-uk \
locale-kbreakout-wa \
locale-kbreakout-zh-CN \
locale-kbreakout-zh-TW"

RDEPENDS:${PN} += "kbreakout"

inherit rpm
