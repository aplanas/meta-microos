SUMMARY = "Translations for package kclock"
DESCRIPTION = "Provides translations for the 'kclock' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kclock-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "3cb3eb98ad088bf441952952c5630062e630e6bc85dadf5c663e0f4e0de44d907fde6411e50675712d33bffc175312d8d5382ae61f16e20d03c77f138b0722a1"
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
