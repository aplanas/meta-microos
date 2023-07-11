SUMMARY = "Translations for package koko"
DESCRIPTION = "Provides translations for the 'koko' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "koko-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "245bb5f90a6b6a2bcfe15d7f1ff256bdaa770e75461492c77bd3934126c01a71c8f57cce54b425d7606c315f3f018a69a9aef51c02458bbd049a84f9b27fd962"
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
