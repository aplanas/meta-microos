SUMMARY = "Translations for package libkdegames"
DESCRIPTION = "Provides translations for the 'libkdegames' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkdegames-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0a7e60c236d464717c636e15fbc2db908abaa6542a01052d7068f996e24ee8a3a746ad08a5b014a80b8ac4047a53fc6c46bbd1060938fb53cee776e68c7333bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdegames-lang \
libkdegames-lang-all \
locale-libkdegames-af \
locale-libkdegames-ar \
locale-libkdegames-be \
locale-libkdegames-bg \
locale-libkdegames-bn \
locale-libkdegames-br \
locale-libkdegames-bs \
locale-libkdegames-ca \
locale-libkdegames-ca@valencia \
locale-libkdegames-cs \
locale-libkdegames-cy \
locale-libkdegames-da \
locale-libkdegames-de \
locale-libkdegames-el \
locale-libkdegames-en-GB \
locale-libkdegames-eo \
locale-libkdegames-es \
locale-libkdegames-et \
locale-libkdegames-eu \
locale-libkdegames-fa \
locale-libkdegames-fi \
locale-libkdegames-fr \
locale-libkdegames-ga \
locale-libkdegames-gl \
locale-libkdegames-he \
locale-libkdegames-hi \
locale-libkdegames-hr \
locale-libkdegames-hu \
locale-libkdegames-id \
locale-libkdegames-is \
locale-libkdegames-it \
locale-libkdegames-ja \
locale-libkdegames-ka \
locale-libkdegames-kk \
locale-libkdegames-km \
locale-libkdegames-ko \
locale-libkdegames-lt \
locale-libkdegames-lv \
locale-libkdegames-mai \
locale-libkdegames-mk \
locale-libkdegames-ml \
locale-libkdegames-mr \
locale-libkdegames-nb \
locale-libkdegames-nds \
locale-libkdegames-ne \
locale-libkdegames-nl \
locale-libkdegames-nn \
locale-libkdegames-oc \
locale-libkdegames-pa \
locale-libkdegames-pl \
locale-libkdegames-pt \
locale-libkdegames-pt-BR \
locale-libkdegames-ro \
locale-libkdegames-ru \
locale-libkdegames-sk \
locale-libkdegames-sl \
locale-libkdegames-sq \
locale-libkdegames-sr \
locale-libkdegames-sr@ijekavian \
locale-libkdegames-sr@ijekavianlatin \
locale-libkdegames-sr@latin \
locale-libkdegames-sv \
locale-libkdegames-ta \
locale-libkdegames-te \
locale-libkdegames-th \
locale-libkdegames-tr \
locale-libkdegames-ug \
locale-libkdegames-uk \
locale-libkdegames-wa \
locale-libkdegames-zh-CN \
locale-libkdegames-zh-TW"

RDEPENDS:${PN} += "libkdegames"

inherit rpm
