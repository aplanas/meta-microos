SUMMARY = "Translations for package util-linux"
DESCRIPTION = "Provides translations for the 'util-linux' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "util-linux-lang-2.39-1.1.noarch.rpm"
RPM_HASH = "21c26e1d0f43cf6283f2d127e5f044cfff12e91a93d8817f378f94eae1a9ecc5018a5814d3dc504186e498a8ccb46803c0d9cca11dc187b2b1134d23d39c041f"
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
