SUMMARY = "Translations for package fwupd"
DESCRIPTION = "Provides translations for the 'fwupd' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "fwupd-lang-1.8.16-2.1.noarch.rpm"
RPM_HASH = "ad0f83f4f8671058e8b97b9eb068399f0d467a5cf2dcf6224f8f5f5dae0c266db5520b12390195b48cfe62395c332be1d4fbe052a5e57a53ce93b9c5f9abedb5"
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
