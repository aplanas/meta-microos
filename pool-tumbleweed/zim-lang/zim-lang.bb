SUMMARY = "Translations for package zim"
DESCRIPTION = "Provides translations for the 'zim' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.75.1"

RPM_NAME = "zim-lang-0.75.1-2.3.noarch.rpm"
RPM_HASH = "e1e63df4102fcce094ac541d5afeeb0d1252016933ce4655db57a38dfab2ae872d83dc6fa98e0371e1181e64fa384b168081b7e81aab2285f527a589647cb050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zim-ar \
locale-zim-ca \
locale-zim-cs \
locale-zim-da \
locale-zim-de \
locale-zim-el \
locale-zim-en-GB \
locale-zim-es \
locale-zim-et \
locale-zim-eu \
locale-zim-fi \
locale-zim-fr \
locale-zim-gl \
locale-zim-he \
locale-zim-hr \
locale-zim-hu \
locale-zim-id \
locale-zim-it \
locale-zim-ja \
locale-zim-ko \
locale-zim-nb \
locale-zim-nl \
locale-zim-pl \
locale-zim-pt \
locale-zim-pt-BR \
locale-zim-ro \
locale-zim-ru \
locale-zim-si \
locale-zim-sk \
locale-zim-sl \
locale-zim-sq \
locale-zim-sr \
locale-zim-sv \
locale-zim-tr \
locale-zim-uk \
locale-zim-vi \
locale-zim-zh-CN \
locale-zim-zh-TW \
zim-lang \
zim-lang-all"

RDEPENDS:${PN} += "zim"

inherit rpm
