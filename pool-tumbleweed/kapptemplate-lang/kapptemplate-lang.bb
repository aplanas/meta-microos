SUMMARY = "Translations for package kapptemplate"
DESCRIPTION = "Provides translations for the 'kapptemplate' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kapptemplate-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "9659366087b90d5af97cd629e9d66a9d0a15c1d9dbf6e3f4e38c7ed15ddf98536bd6e387e2cb1160cc1f14ce56276af29fd6887847884404b4956714348a8f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapptemplate-lang \
kapptemplate-lang-all \
locale-kapptemplate-bg \
locale-kapptemplate-bs \
locale-kapptemplate-ca \
locale-kapptemplate-ca@valencia \
locale-kapptemplate-cs \
locale-kapptemplate-da \
locale-kapptemplate-de \
locale-kapptemplate-el \
locale-kapptemplate-en-GB \
locale-kapptemplate-eo \
locale-kapptemplate-es \
locale-kapptemplate-et \
locale-kapptemplate-eu \
locale-kapptemplate-fi \
locale-kapptemplate-fr \
locale-kapptemplate-ga \
locale-kapptemplate-gl \
locale-kapptemplate-hu \
locale-kapptemplate-it \
locale-kapptemplate-ja \
locale-kapptemplate-ka \
locale-kapptemplate-kk \
locale-kapptemplate-ko \
locale-kapptemplate-lt \
locale-kapptemplate-lv \
locale-kapptemplate-mr \
locale-kapptemplate-nb \
locale-kapptemplate-nds \
locale-kapptemplate-nl \
locale-kapptemplate-nn \
locale-kapptemplate-pl \
locale-kapptemplate-pt \
locale-kapptemplate-pt-BR \
locale-kapptemplate-ru \
locale-kapptemplate-sk \
locale-kapptemplate-sl \
locale-kapptemplate-sq \
locale-kapptemplate-sr \
locale-kapptemplate-sr@ijekavian \
locale-kapptemplate-sr@ijekavianlatin \
locale-kapptemplate-sr@latin \
locale-kapptemplate-sv \
locale-kapptemplate-th \
locale-kapptemplate-tr \
locale-kapptemplate-ug \
locale-kapptemplate-uk \
locale-kapptemplate-zh-CN \
locale-kapptemplate-zh-TW"

RDEPENDS:${PN} += "kapptemplate"

inherit rpm
