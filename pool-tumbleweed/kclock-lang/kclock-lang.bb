SUMMARY = "Translations for package kclock"
DESCRIPTION = "Provides translations for the 'kclock' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kclock-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "97745a85af68e0ed63eee3225c0f5fcab3ef993c24e933ea7a1141f27e73d21ca10492d8ca77d4d61dac2b643d068a1c3b64b07f85094275e7fdc2bb6add35df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kclock-lang \
kclock-lang-all \
locale-kclock-ar \
locale-kclock-ca \
locale-kclock-ca@valencia \
locale-kclock-cs \
locale-kclock-de \
locale-kclock-el \
locale-kclock-en-GB \
locale-kclock-es \
locale-kclock-eu \
locale-kclock-fi \
locale-kclock-fr \
locale-kclock-hi \
locale-kclock-hu \
locale-kclock-it \
locale-kclock-ja \
locale-kclock-ka \
locale-kclock-ko \
locale-kclock-lt \
locale-kclock-nl \
locale-kclock-nn \
locale-kclock-pa \
locale-kclock-pl \
locale-kclock-pt \
locale-kclock-pt-BR \
locale-kclock-ro \
locale-kclock-ru \
locale-kclock-sk \
locale-kclock-sl \
locale-kclock-sv \
locale-kclock-tr \
locale-kclock-uk \
locale-kclock-zh-CN \
locale-kclock-zh-TW"

RDEPENDS:${PN} += "kclock"

inherit rpm
