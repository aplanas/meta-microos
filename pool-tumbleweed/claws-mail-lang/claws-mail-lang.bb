SUMMARY = "Translations for package claws-mail"
DESCRIPTION = "Provides translations for the 'claws-mail' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-lang-4.1.1-2.7.noarch.rpm"
RPM_HASH = "b0eb892b87d87bdc69acdf0c5a1352ad4aa468bd945ace08fdedadab31cca6c49b7447e06f209985c0ac59097e65188cc4b05e5e9dfc5795f24f24bed11e03a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "claws-mail-lang \
claws-mail-lang-all \
locale-claws-mail-ca \
locale-claws-mail-cs \
locale-claws-mail-da \
locale-claws-mail-de \
locale-claws-mail-el-GR \
locale-claws-mail-en-GB \
locale-claws-mail-es \
locale-claws-mail-fi \
locale-claws-mail-fr \
locale-claws-mail-hu \
locale-claws-mail-it \
locale-claws-mail-ja \
locale-claws-mail-nb \
locale-claws-mail-nl \
locale-claws-mail-pl \
locale-claws-mail-pt-BR \
locale-claws-mail-ro \
locale-claws-mail-ru \
locale-claws-mail-sk \
locale-claws-mail-sv \
locale-claws-mail-tr \
locale-claws-mail-zh-TW"

RDEPENDS:${PN} += "claws-mail"

inherit rpm
