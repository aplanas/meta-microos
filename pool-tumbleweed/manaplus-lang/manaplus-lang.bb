SUMMARY = "Translations for package manaplus"
DESCRIPTION = "Provides translations for the 'manaplus' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.3.17"

RPM_NAME = "manaplus-lang-2.1.3.17-3.2.noarch.rpm"
RPM_HASH = "83db056f85cc52cbe85017dc01f075f2a3c71645d1d3fd117fae15ca5d3fd70c2c0b6db8f9497a0613b730c779b1777dff88a755853b09488d726d26a7812a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-manaplus-ca \
locale-manaplus-cs \
locale-manaplus-de \
locale-manaplus-eo \
locale-manaplus-es \
locale-manaplus-fi \
locale-manaplus-fr \
locale-manaplus-id \
locale-manaplus-it \
locale-manaplus-ja \
locale-manaplus-nl \
locale-manaplus-nl-BE \
locale-manaplus-pl \
locale-manaplus-pt \
locale-manaplus-pt-BR \
locale-manaplus-ru \
locale-manaplus-sr \
locale-manaplus-sv \
locale-manaplus-tr \
locale-manaplus-uk \
locale-manaplus-zh-CN \
locale-manaplus-zh-HK \
manaplus-lang \
manaplus-lang-all"

RDEPENDS:${PN} += "manaplus"

inherit rpm
