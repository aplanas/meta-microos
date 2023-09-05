SUMMARY = "Translations for package kmailtransport"
DESCRIPTION = "Provides translations for the 'kmailtransport' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmailtransport-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "724f18eb858245d93af8d3dd0a0c220fd458d0dc9bba789f7f9f9c4a0158293e24b54e13804dc6f8fa27cffd050749000736028a641344a1162d7502143b996b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmailtransport-lang \
kmailtransport-lang-all \
locale-kmailtransport-ar \
locale-kmailtransport-be \
locale-kmailtransport-bg \
locale-kmailtransport-bs \
locale-kmailtransport-ca \
locale-kmailtransport-ca@valencia \
locale-kmailtransport-cs \
locale-kmailtransport-da \
locale-kmailtransport-de \
locale-kmailtransport-el \
locale-kmailtransport-en-GB \
locale-kmailtransport-eo \
locale-kmailtransport-es \
locale-kmailtransport-et \
locale-kmailtransport-eu \
locale-kmailtransport-fi \
locale-kmailtransport-fr \
locale-kmailtransport-ga \
locale-kmailtransport-gl \
locale-kmailtransport-hi \
locale-kmailtransport-hu \
locale-kmailtransport-ia \
locale-kmailtransport-it \
locale-kmailtransport-ja \
locale-kmailtransport-ka \
locale-kmailtransport-kk \
locale-kmailtransport-km \
locale-kmailtransport-ko \
locale-kmailtransport-lt \
locale-kmailtransport-lv \
locale-kmailtransport-mai \
locale-kmailtransport-mr \
locale-kmailtransport-nb \
locale-kmailtransport-nds \
locale-kmailtransport-nl \
locale-kmailtransport-nn \
locale-kmailtransport-pa \
locale-kmailtransport-pl \
locale-kmailtransport-pt \
locale-kmailtransport-pt-BR \
locale-kmailtransport-ro \
locale-kmailtransport-ru \
locale-kmailtransport-sk \
locale-kmailtransport-sl \
locale-kmailtransport-sr \
locale-kmailtransport-sr@ijekavian \
locale-kmailtransport-sr@ijekavianlatin \
locale-kmailtransport-sr@latin \
locale-kmailtransport-sv \
locale-kmailtransport-th \
locale-kmailtransport-tr \
locale-kmailtransport-ug \
locale-kmailtransport-uk \
locale-kmailtransport-zh-CN \
locale-kmailtransport-zh-TW"

RDEPENDS:${PN} += "kmailtransport"

inherit rpm
