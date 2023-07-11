SUMMARY = "Translations for package minetest"
DESCRIPTION = "Provides translations for the 'minetest' package."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetest-lang-5.7.0-1.2.noarch.rpm"
RPM_HASH = "17011c23154ee4ac4f49ddbdaf446a2eb55550f5eea71696dc7e0edfa6f4d36a81b103f0759e1d679c483ec148a3cadaf459224e511a662ccee56dd2595af0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minetest-be \
locale-minetest-bg \
locale-minetest-ca \
locale-minetest-cs \
locale-minetest-cy \
locale-minetest-da \
locale-minetest-de \
locale-minetest-el \
locale-minetest-eo \
locale-minetest-es \
locale-minetest-et \
locale-minetest-eu \
locale-minetest-fi \
locale-minetest-fr \
locale-minetest-gd \
locale-minetest-gl \
locale-minetest-hu \
locale-minetest-id \
locale-minetest-it \
locale-minetest-ja \
locale-minetest-kk \
locale-minetest-ko \
locale-minetest-lt \
locale-minetest-lv \
locale-minetest-mr \
locale-minetest-ms \
locale-minetest-nb \
locale-minetest-nl \
locale-minetest-nn \
locale-minetest-oc \
locale-minetest-pl \
locale-minetest-pt \
locale-minetest-pt-BR \
locale-minetest-ro \
locale-minetest-ru \
locale-minetest-sk \
locale-minetest-sl \
locale-minetest-sv \
locale-minetest-tr \
locale-minetest-uk \
locale-minetest-vi \
locale-minetest-zh-CN \
locale-minetest-zh-TW \
minetest-lang \
minetest-lang-all"

RDEPENDS:${PN} += "minetest"

inherit rpm
