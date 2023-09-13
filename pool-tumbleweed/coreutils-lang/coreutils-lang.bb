SUMMARY = "Translations for package coreutils"
DESCRIPTION = "Provides translations for the 'coreutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "9.4"

RPM_NAME = "coreutils-lang-9.4-1.1.noarch.rpm"
RPM_HASH = "377255c3ea22cb7f087e8575107e4c9d6e1ef1cb3cf0b8ce4305da2662fa1a340a51440f09643861148deded967a8579986018bc3ecd27188bbc43dfff52e449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-lang \
coreutils-lang-all \
locale-coreutils-af \
locale-coreutils-be \
locale-coreutils-bg \
locale-coreutils-ca \
locale-coreutils-cs \
locale-coreutils-da \
locale-coreutils-de \
locale-coreutils-el \
locale-coreutils-eo \
locale-coreutils-es \
locale-coreutils-et \
locale-coreutils-eu \
locale-coreutils-fi \
locale-coreutils-fr \
locale-coreutils-ga \
locale-coreutils-gl \
locale-coreutils-hr \
locale-coreutils-hu \
locale-coreutils-ia \
locale-coreutils-id \
locale-coreutils-it \
locale-coreutils-ja \
locale-coreutils-ka \
locale-coreutils-kk \
locale-coreutils-ko \
locale-coreutils-lt \
locale-coreutils-ms \
locale-coreutils-nb \
locale-coreutils-nl \
locale-coreutils-pl \
locale-coreutils-pt \
locale-coreutils-pt-BR \
locale-coreutils-ro \
locale-coreutils-ru \
locale-coreutils-sk \
locale-coreutils-sl \
locale-coreutils-sr \
locale-coreutils-sv \
locale-coreutils-ta \
locale-coreutils-tr \
locale-coreutils-uk \
locale-coreutils-vi \
locale-coreutils-zh-CN \
locale-coreutils-zh-TW"

RDEPENDS:${PN} += "coreutils"

inherit rpm
