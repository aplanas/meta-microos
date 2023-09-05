SUMMARY = "Translations for package kget"
DESCRIPTION = "Provides translations for the 'kget' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kget-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9da7bad19db9a13f52815935905fbf9154bf4315ef67d1a03b0540c7acc79a7e3a43326fa726bbc42ac6a3520b32c726b7447cd97125ba94b2c634afeb27e048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kget-lang \
kget-lang-all \
locale-kget-af \
locale-kget-ar \
locale-kget-be \
locale-kget-bg \
locale-kget-br \
locale-kget-bs \
locale-kget-ca \
locale-kget-ca@valencia \
locale-kget-cs \
locale-kget-cy \
locale-kget-da \
locale-kget-de \
locale-kget-el \
locale-kget-en-GB \
locale-kget-eo \
locale-kget-es \
locale-kget-et \
locale-kget-eu \
locale-kget-fa \
locale-kget-fi \
locale-kget-fr \
locale-kget-ga \
locale-kget-gl \
locale-kget-he \
locale-kget-hi \
locale-kget-hr \
locale-kget-hu \
locale-kget-ia \
locale-kget-id \
locale-kget-is \
locale-kget-it \
locale-kget-ja \
locale-kget-ka \
locale-kget-kk \
locale-kget-km \
locale-kget-ko \
locale-kget-lt \
locale-kget-lv \
locale-kget-mai \
locale-kget-mk \
locale-kget-mr \
locale-kget-ms \
locale-kget-nb \
locale-kget-nds \
locale-kget-ne \
locale-kget-nl \
locale-kget-nn \
locale-kget-oc \
locale-kget-pa \
locale-kget-pl \
locale-kget-pt \
locale-kget-pt-BR \
locale-kget-ro \
locale-kget-ru \
locale-kget-si \
locale-kget-sk \
locale-kget-sl \
locale-kget-sq \
locale-kget-sr \
locale-kget-sr@ijekavian \
locale-kget-sr@ijekavianlatin \
locale-kget-sr@latin \
locale-kget-sv \
locale-kget-ta \
locale-kget-th \
locale-kget-tr \
locale-kget-ug \
locale-kget-uk \
locale-kget-vi \
locale-kget-wa \
locale-kget-zh-CN \
locale-kget-zh-HK \
locale-kget-zh-TW"

RDEPENDS:${PN} += "kget"

inherit rpm
