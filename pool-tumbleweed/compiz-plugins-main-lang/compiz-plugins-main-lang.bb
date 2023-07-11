SUMMARY = "Translations for package compiz-plugins-main"
DESCRIPTION = "Provides translations for the 'compiz-plugins-main' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-lang-0.8.18-1.16.noarch.rpm"
RPM_HASH = "4dcd33ddd3e3bf7395f31860a6d2b136630ba36bfad37857b62098f822c69d73f41d837fb1a20049add1c0d508f0136f0e6ffb5bc8579d81fbacadc62ee0ede9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-plugins-main-lang \
compiz-plugins-main-lang-all \
locale-compiz-plugins-main-ar \
locale-compiz-plugins-main-bn \
locale-compiz-plugins-main-ca \
locale-compiz-plugins-main-cs \
locale-compiz-plugins-main-de \
locale-compiz-plugins-main-el \
locale-compiz-plugins-main-en-GB \
locale-compiz-plugins-main-es \
locale-compiz-plugins-main-eu \
locale-compiz-plugins-main-fa \
locale-compiz-plugins-main-fi \
locale-compiz-plugins-main-fr \
locale-compiz-plugins-main-gl \
locale-compiz-plugins-main-gu \
locale-compiz-plugins-main-he \
locale-compiz-plugins-main-hi \
locale-compiz-plugins-main-hu \
locale-compiz-plugins-main-it \
locale-compiz-plugins-main-ja \
locale-compiz-plugins-main-ko \
locale-compiz-plugins-main-nb \
locale-compiz-plugins-main-nl \
locale-compiz-plugins-main-pl \
locale-compiz-plugins-main-pt \
locale-compiz-plugins-main-pt-BR \
locale-compiz-plugins-main-ru \
locale-compiz-plugins-main-sv \
locale-compiz-plugins-main-tr \
locale-compiz-plugins-main-zh-CN"

RDEPENDS:${PN} += "compiz-plugins-main"

inherit rpm
