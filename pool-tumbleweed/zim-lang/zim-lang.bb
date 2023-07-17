SUMMARY = "Translations for package zim"
DESCRIPTION = "Provides translations for the 'zim' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.75.2"

RPM_NAME = "zim-lang-0.75.2-1.1.noarch.rpm"
RPM_HASH = "8a48898da12b1ea4bba03abfc4d99bb69514c9686c3a451f3af1b3a9dea92a083c07f001238d0e938450fd7e059180eae241ee8ff6bc8e5179b5e4c7c4576934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zim-ar \
locale-zim-ca \
locale-zim-cs \
locale-zim-da \
locale-zim-de \
locale-zim-el \
locale-zim-en-GB \
locale-zim-eo \
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
