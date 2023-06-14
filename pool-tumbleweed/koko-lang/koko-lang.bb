SUMMARY = "Translations for package koko"
DESCRIPTION = "Provides translations for the 'koko' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "koko-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "d21145fb8da5a16af017a814e7079126927a0974a1b039872ca29177d0110d95f2927ef57c53f8969c1f08daab3b44927092b2974bd5f422d8f6a5a38e3f4bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "koko-lang \
koko-lang-all \
locale-koko-ar \
locale-koko-bg \
locale-koko-ca \
locale-koko-ca@valencia \
locale-koko-cs \
locale-koko-da \
locale-koko-de \
locale-koko-el \
locale-koko-en-GB \
locale-koko-es \
locale-koko-eu \
locale-koko-fi \
locale-koko-fr \
locale-koko-it \
locale-koko-ja \
locale-koko-ka \
locale-koko-ko \
locale-koko-lt \
locale-koko-nl \
locale-koko-nn \
locale-koko-pa \
locale-koko-pl \
locale-koko-pt \
locale-koko-pt-BR \
locale-koko-ru \
locale-koko-sk \
locale-koko-sl \
locale-koko-sv \
locale-koko-tr \
locale-koko-uk \
locale-koko-zh-CN \
locale-koko-zh-TW"

RDEPENDS:${PN} += "koko"

inherit rpm
