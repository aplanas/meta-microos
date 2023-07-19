SUMMARY = "Translations for package util-linux"
DESCRIPTION = "Provides translations for the 'util-linux' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "util-linux-lang-2.39-3.1.noarch.rpm"
RPM_HASH = "9bcfa5a697464f8dade6c3d502b88d478b6923ea18c74b2973d652f68c491807cac56a844c0bf854b4c043da960e351749542e2e7d139df4a92c4a5ca275897e"
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
