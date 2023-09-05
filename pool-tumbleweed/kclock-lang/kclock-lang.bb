SUMMARY = "Translations for package kclock"
DESCRIPTION = "Provides translations for the 'kclock' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kclock-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "a9b233d938d268f1c02a25ede0c4bed7f0a002325b885980d0b4098b898e968fe209695244a0b01fd55e3fe88f55506ef87db1cc43ada5298ea8968efe1e4c6f"
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
