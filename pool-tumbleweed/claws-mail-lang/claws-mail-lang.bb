SUMMARY = "Translations for package claws-mail"
DESCRIPTION = "Provides translations for the 'claws-mail' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-lang-4.1.1-2.6.noarch.rpm"
RPM_HASH = "133358a80cb983a2ea8946493b8be39678574726cddf32ec523651d88f38e99ace827d376c0df58a88d336fc2938efd425c29e8f95bbee8ee67f20e843a3ab5c"
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
