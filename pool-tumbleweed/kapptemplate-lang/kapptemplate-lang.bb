SUMMARY = "Translations for package kapptemplate"
DESCRIPTION = "Provides translations for the 'kapptemplate' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kapptemplate-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "55d984b370bb8bdcac44337dee7b1359193726d660ac951910f28b78d400e5f68aeba76bd179af6f3979fa71cc71c01d875ced3ef0e1093c7e4c8cf4c1d870e4"
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
