SUMMARY = "Translations for package kaffeine"
DESCRIPTION = "Provides translations for the 'kaffeine' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.18git.20230531T022124~afc6c12"

RPM_NAME = "kaffeine-lang-2.0.18git.20230531T022124~afc6c12-1.1.noarch.rpm"
RPM_HASH = "bacdd81d7c5f9cd97b84503b4dc3f01f34d067857aac2ee9db0025b81c9fe16322f4eec49975b7c9d2bab9f2515c97630e947c7a4fcac531908d37013b8b154e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaffeine-lang \
kaffeine-lang-all \
locale-kaffeine-ar \
locale-kaffeine-be \
locale-kaffeine-bg \
locale-kaffeine-bs \
locale-kaffeine-ca \
locale-kaffeine-ca@valencia \
locale-kaffeine-cs \
locale-kaffeine-da \
locale-kaffeine-de \
locale-kaffeine-el \
locale-kaffeine-en-GB \
locale-kaffeine-eo \
locale-kaffeine-es \
locale-kaffeine-et \
locale-kaffeine-eu \
locale-kaffeine-fi \
locale-kaffeine-fr \
locale-kaffeine-ga \
locale-kaffeine-gl \
locale-kaffeine-hr \
locale-kaffeine-hu \
locale-kaffeine-ia \
locale-kaffeine-id \
locale-kaffeine-it \
locale-kaffeine-ja \
locale-kaffeine-ka \
locale-kaffeine-km \
locale-kaffeine-ko \
locale-kaffeine-lt \
locale-kaffeine-mai \
locale-kaffeine-mr \
locale-kaffeine-nb \
locale-kaffeine-nds \
locale-kaffeine-nl \
locale-kaffeine-nn \
locale-kaffeine-pa \
locale-kaffeine-pl \
locale-kaffeine-pt \
locale-kaffeine-pt-BR \
locale-kaffeine-ro \
locale-kaffeine-ru \
locale-kaffeine-sk \
locale-kaffeine-sl \
locale-kaffeine-sq \
locale-kaffeine-sr \
locale-kaffeine-sr@ijekavian \
locale-kaffeine-sr@ijekavianlatin \
locale-kaffeine-sr@latin \
locale-kaffeine-sv \
locale-kaffeine-th \
locale-kaffeine-tr \
locale-kaffeine-ug \
locale-kaffeine-uk \
locale-kaffeine-zh-CN \
locale-kaffeine-zh-TW"

RDEPENDS:${PN} += "kaffeine"

inherit rpm
