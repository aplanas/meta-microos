SUMMARY = "Translations for package compiz-plugins-main"
DESCRIPTION = "Provides translations for the 'compiz-plugins-main' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-lang-0.8.18-1.15.noarch.rpm"
RPM_HASH = "8ad3c4285b6fdf9a0a221255eaaf1cf56c8dac354870515c9a4ddcb9c4f215874ac2940b6d75c2bcc54758b0f4cc855ebd7e95faa3b08c9ef8d1ecb0a1bca899"
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
