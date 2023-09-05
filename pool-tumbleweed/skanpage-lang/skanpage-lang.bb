SUMMARY = "Translations for package skanpage"
DESCRIPTION = "Provides translations for the 'skanpage' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "skanpage-lang-23.08.0-2.1.noarch.rpm"
RPM_HASH = "20d6a98b7dad7361ddbf84db866d25ebd342eda1860be9adf2998fa11ddefd60b51e4abe9236e45b9e2240988a4edb2f4321fba194b90ca35921dfa3e1ae2b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanpage-ar \
locale-skanpage-az \
locale-skanpage-be \
locale-skanpage-bg \
locale-skanpage-ca \
locale-skanpage-ca@valencia \
locale-skanpage-cs \
locale-skanpage-de \
locale-skanpage-el \
locale-skanpage-en-GB \
locale-skanpage-es \
locale-skanpage-eu \
locale-skanpage-fi \
locale-skanpage-fr \
locale-skanpage-ia \
locale-skanpage-id \
locale-skanpage-is \
locale-skanpage-it \
locale-skanpage-ja \
locale-skanpage-ka \
locale-skanpage-ko \
locale-skanpage-lt \
locale-skanpage-nl \
locale-skanpage-pl \
locale-skanpage-pt \
locale-skanpage-pt-BR \
locale-skanpage-ru \
locale-skanpage-sk \
locale-skanpage-sl \
locale-skanpage-sv \
locale-skanpage-tr \
locale-skanpage-uk \
locale-skanpage-zh-CN \
locale-skanpage-zh-TW \
skanpage-lang \
skanpage-lang-all"

RDEPENDS:${PN} += "skanpage"

inherit rpm
