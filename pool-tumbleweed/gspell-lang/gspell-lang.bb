SUMMARY = "Translations for package gspell"
DESCRIPTION = "Provides translations for the 'gspell' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "gspell-lang-1.12.2-1.1.noarch.rpm"
RPM_HASH = "955275a0a2cfa60eb3910c5ea2e8fc4262ba4926ff024e278fd6eeedf13259e9062eb5e36f358478aa9ebfc9d4723d8309381155657be3c15982caeb02e8d881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gspell-lang \
gspell-lang-all \
locale-gspell-ar \
locale-gspell-be \
locale-gspell-bg \
locale-gspell-ca \
locale-gspell-ca@valencia \
locale-gspell-cs \
locale-gspell-da \
locale-gspell-de \
locale-gspell-el \
locale-gspell-en-GB \
locale-gspell-eo \
locale-gspell-es \
locale-gspell-eu \
locale-gspell-fa \
locale-gspell-fi \
locale-gspell-fr \
locale-gspell-fur \
locale-gspell-gd \
locale-gspell-gl \
locale-gspell-he \
locale-gspell-hr \
locale-gspell-hu \
locale-gspell-id \
locale-gspell-is \
locale-gspell-it \
locale-gspell-ja \
locale-gspell-ka \
locale-gspell-kk \
locale-gspell-ko \
locale-gspell-lt \
locale-gspell-lv \
locale-gspell-ml \
locale-gspell-ms \
locale-gspell-nb \
locale-gspell-ne \
locale-gspell-nl \
locale-gspell-oc \
locale-gspell-pa \
locale-gspell-pl \
locale-gspell-pt \
locale-gspell-pt-BR \
locale-gspell-ro \
locale-gspell-ru \
locale-gspell-sk \
locale-gspell-sl \
locale-gspell-sr \
locale-gspell-sr@latin \
locale-gspell-sv \
locale-gspell-tr \
locale-gspell-uk \
locale-gspell-vi \
locale-gspell-zh-CN \
locale-gspell-zh-TW"

RDEPENDS:${PN} += "gspell"

inherit rpm
