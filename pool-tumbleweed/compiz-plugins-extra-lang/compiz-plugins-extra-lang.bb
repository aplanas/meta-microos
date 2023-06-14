SUMMARY = "Translations for package compiz-plugins-extra"
DESCRIPTION = "Provides translations for the 'compiz-plugins-extra' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-lang-0.8.18-1.15.noarch.rpm"
RPM_HASH = "af1d620fd19a669be272954db393d19aed8ec865d30ce4d315bcfa32e6955578cfa63c7532aad3c2807c61124512851c382f0987304a1b20f637431ba2f1fab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-plugins-extra-lang \
compiz-plugins-extra-lang-all \
locale-compiz-plugins-extra-ar \
locale-compiz-plugins-extra-bn \
locale-compiz-plugins-extra-ca \
locale-compiz-plugins-extra-cs \
locale-compiz-plugins-extra-de \
locale-compiz-plugins-extra-el \
locale-compiz-plugins-extra-en-GB \
locale-compiz-plugins-extra-es \
locale-compiz-plugins-extra-eu \
locale-compiz-plugins-extra-fi \
locale-compiz-plugins-extra-fr \
locale-compiz-plugins-extra-gl \
locale-compiz-plugins-extra-gu \
locale-compiz-plugins-extra-he \
locale-compiz-plugins-extra-hi \
locale-compiz-plugins-extra-hu \
locale-compiz-plugins-extra-it \
locale-compiz-plugins-extra-ja \
locale-compiz-plugins-extra-ko \
locale-compiz-plugins-extra-nb \
locale-compiz-plugins-extra-nl \
locale-compiz-plugins-extra-pl \
locale-compiz-plugins-extra-pt \
locale-compiz-plugins-extra-pt-BR \
locale-compiz-plugins-extra-ru \
locale-compiz-plugins-extra-sv \
locale-compiz-plugins-extra-tr \
locale-compiz-plugins-extra-zh-CN"

RDEPENDS:${PN} += "compiz-plugins-extra"

inherit rpm
