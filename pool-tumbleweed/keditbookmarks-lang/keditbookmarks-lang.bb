SUMMARY = "Translations for package keditbookmarks"
DESCRIPTION = "Provides translations for the 'keditbookmarks' package."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "keditbookmarks-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "6cd9884ff58773a164963166263dc5cb026f83a383b2bf6033aaa5df5c8f0bf43aa557cad8105d0376565c14165bc516bbcd568433dffaeff3473204fe45cc7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keditbookmarks-lang \
keditbookmarks-lang-all \
locale-keditbookmarks-ar \
locale-keditbookmarks-be \
locale-keditbookmarks-be@latin \
locale-keditbookmarks-bg \
locale-keditbookmarks-bn-IN \
locale-keditbookmarks-bs \
locale-keditbookmarks-ca \
locale-keditbookmarks-ca@valencia \
locale-keditbookmarks-cs \
locale-keditbookmarks-da \
locale-keditbookmarks-de \
locale-keditbookmarks-el \
locale-keditbookmarks-en-GB \
locale-keditbookmarks-eo \
locale-keditbookmarks-es \
locale-keditbookmarks-et \
locale-keditbookmarks-eu \
locale-keditbookmarks-fa \
locale-keditbookmarks-fi \
locale-keditbookmarks-fr \
locale-keditbookmarks-ga \
locale-keditbookmarks-gl \
locale-keditbookmarks-gu \
locale-keditbookmarks-he \
locale-keditbookmarks-hi \
locale-keditbookmarks-hr \
locale-keditbookmarks-hu \
locale-keditbookmarks-ia \
locale-keditbookmarks-id \
locale-keditbookmarks-is \
locale-keditbookmarks-it \
locale-keditbookmarks-ja \
locale-keditbookmarks-ka \
locale-keditbookmarks-kk \
locale-keditbookmarks-km \
locale-keditbookmarks-kn \
locale-keditbookmarks-ko \
locale-keditbookmarks-lt \
locale-keditbookmarks-lv \
locale-keditbookmarks-mai \
locale-keditbookmarks-mk \
locale-keditbookmarks-ml \
locale-keditbookmarks-mr \
locale-keditbookmarks-ms \
locale-keditbookmarks-nb \
locale-keditbookmarks-nds \
locale-keditbookmarks-ne \
locale-keditbookmarks-nl \
locale-keditbookmarks-nn \
locale-keditbookmarks-oc \
locale-keditbookmarks-or \
locale-keditbookmarks-pa \
locale-keditbookmarks-pl \
locale-keditbookmarks-pt \
locale-keditbookmarks-pt-BR \
locale-keditbookmarks-ro \
locale-keditbookmarks-ru \
locale-keditbookmarks-si \
locale-keditbookmarks-sk \
locale-keditbookmarks-sl \
locale-keditbookmarks-sq \
locale-keditbookmarks-sr \
locale-keditbookmarks-sr@ijekavian \
locale-keditbookmarks-sr@ijekavianlatin \
locale-keditbookmarks-sr@latin \
locale-keditbookmarks-sv \
locale-keditbookmarks-ta \
locale-keditbookmarks-te \
locale-keditbookmarks-th \
locale-keditbookmarks-tr \
locale-keditbookmarks-ug \
locale-keditbookmarks-uk \
locale-keditbookmarks-vi \
locale-keditbookmarks-wa \
locale-keditbookmarks-zh-CN \
locale-keditbookmarks-zh-TW"

RDEPENDS:${PN} += "keditbookmarks"

inherit rpm
