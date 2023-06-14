SUMMARY = "Translations for package fwupd"
DESCRIPTION = "Provides translations for the 'fwupd' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "fwupd-lang-1.8.12-1.3.noarch.rpm"
RPM_HASH = "5c846f992202a07e547321bc12e3a9dc2d437ce8ee12921a377ebf565300a13f4d65af7b0f5a867a5090b65bc40c402dfcd657f4c61b6c5351675ac9f1055eac"
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
