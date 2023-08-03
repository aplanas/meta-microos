SUMMARY = "Translations for package fwupd"
DESCRIPTION = "Provides translations for the 'fwupd' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "fwupd-lang-1.8.17-1.1.noarch.rpm"
RPM_HASH = "8234e8ee4e2ed40ae9520b9d7f60879d7d4c157bb936548a24df7c2f512e8c2fbd8f734946fe0ad2152b7c80dde2129d24c93ab0fa3cb076e7b0daf633915e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-lang \
fwupd-lang-all \
locale-fwupd-af \
locale-fwupd-ast \
locale-fwupd-ca \
locale-fwupd-cs \
locale-fwupd-da \
locale-fwupd-de \
locale-fwupd-en-GB \
locale-fwupd-eo \
locale-fwupd-es \
locale-fwupd-eu \
locale-fwupd-fi \
locale-fwupd-fr \
locale-fwupd-fur \
locale-fwupd-gl \
locale-fwupd-he \
locale-fwupd-hi \
locale-fwupd-hr \
locale-fwupd-hu \
locale-fwupd-id \
locale-fwupd-it \
locale-fwupd-ja \
locale-fwupd-ka \
locale-fwupd-kk \
locale-fwupd-ko \
locale-fwupd-lt \
locale-fwupd-nl \
locale-fwupd-oc \
locale-fwupd-pa \
locale-fwupd-pl \
locale-fwupd-pt \
locale-fwupd-pt-BR \
locale-fwupd-ru \
locale-fwupd-si \
locale-fwupd-sk \
locale-fwupd-sr \
locale-fwupd-sv \
locale-fwupd-tr \
locale-fwupd-uk \
locale-fwupd-zh-CN \
locale-fwupd-zh-TW"

RDEPENDS:${PN} += "fwupd"

inherit rpm
