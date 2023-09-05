SUMMARY = "Translations for package knetwalk"
DESCRIPTION = "Provides translations for the 'knetwalk' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "knetwalk-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "d29b33c0fb0e904c5c4c262b531f7970b3a2aa739fa1b42fc02ca0e5aab0a9eaf324444a33a152c68484375c20cdda49319867b9e61c3a8629a066f8a9e9ef0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knetwalk-lang \
knetwalk-lang-all \
locale-knetwalk-ar \
locale-knetwalk-be \
locale-knetwalk-bg \
locale-knetwalk-br \
locale-knetwalk-bs \
locale-knetwalk-ca \
locale-knetwalk-ca@valencia \
locale-knetwalk-cs \
locale-knetwalk-cy \
locale-knetwalk-da \
locale-knetwalk-de \
locale-knetwalk-el \
locale-knetwalk-en-GB \
locale-knetwalk-eo \
locale-knetwalk-es \
locale-knetwalk-et \
locale-knetwalk-eu \
locale-knetwalk-fa \
locale-knetwalk-fi \
locale-knetwalk-fr \
locale-knetwalk-ga \
locale-knetwalk-gl \
locale-knetwalk-he \
locale-knetwalk-hi \
locale-knetwalk-hr \
locale-knetwalk-hu \
locale-knetwalk-id \
locale-knetwalk-is \
locale-knetwalk-it \
locale-knetwalk-ja \
locale-knetwalk-ka \
locale-knetwalk-kk \
locale-knetwalk-km \
locale-knetwalk-ko \
locale-knetwalk-lt \
locale-knetwalk-lv \
locale-knetwalk-mai \
locale-knetwalk-mk \
locale-knetwalk-ml \
locale-knetwalk-mr \
locale-knetwalk-nb \
locale-knetwalk-nds \
locale-knetwalk-ne \
locale-knetwalk-nl \
locale-knetwalk-nn \
locale-knetwalk-oc \
locale-knetwalk-pa \
locale-knetwalk-pl \
locale-knetwalk-pt \
locale-knetwalk-pt-BR \
locale-knetwalk-ro \
locale-knetwalk-ru \
locale-knetwalk-sk \
locale-knetwalk-sl \
locale-knetwalk-sq \
locale-knetwalk-sr \
locale-knetwalk-sr@ijekavian \
locale-knetwalk-sr@ijekavianlatin \
locale-knetwalk-sr@latin \
locale-knetwalk-sv \
locale-knetwalk-te \
locale-knetwalk-th \
locale-knetwalk-tr \
locale-knetwalk-ug \
locale-knetwalk-uk \
locale-knetwalk-zh-CN \
locale-knetwalk-zh-TW"

RDEPENDS:${PN} += "knetwalk"

inherit rpm
