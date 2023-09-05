SUMMARY = "Translations for package koko"
DESCRIPTION = "Provides translations for the 'koko' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "koko-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "99a411e6f345d8148c4792084e9042f312fdb6127d6ba3c5156d773fbf0c24fa1b29f9d79e55d96a35bf495fbed3f7de6ec8f9434ee5c5358ecfbd1c60d7752e"
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
