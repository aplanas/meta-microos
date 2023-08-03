SUMMARY = "Translations for package util-linux"
DESCRIPTION = "Provides translations for the 'util-linux' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "util-linux-lang-2.39.1-1.1.noarch.rpm"
RPM_HASH = "4c8d6875f45ee6c0be34ddf5b8a290e35f2582c569170c8c3f6b296415c497df5dc34fa6af7b8682c3dfb3d3ee998e5f8da4754c866e269236c3629d493dced7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-util-linux-ca \
locale-util-linux-cs \
locale-util-linux-da \
locale-util-linux-de \
locale-util-linux-es \
locale-util-linux-et \
locale-util-linux-eu \
locale-util-linux-fi \
locale-util-linux-fr \
locale-util-linux-gl \
locale-util-linux-hr \
locale-util-linux-hu \
locale-util-linux-id \
locale-util-linux-it \
locale-util-linux-ja \
locale-util-linux-ko \
locale-util-linux-nl \
locale-util-linux-pl \
locale-util-linux-pt \
locale-util-linux-pt-BR \
locale-util-linux-ru \
locale-util-linux-sk \
locale-util-linux-sl \
locale-util-linux-sr \
locale-util-linux-sv \
locale-util-linux-tr \
locale-util-linux-uk \
locale-util-linux-vi \
locale-util-linux-zh-CN \
locale-util-linux-zh-TW \
util-linux-lang \
util-linux-lang-all"

RDEPENDS:${PN} += "util-linux"

inherit rpm
