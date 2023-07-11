SUMMARY = "Translations for package compiz"
DESCRIPTION = "Provides translations for the 'compiz' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-lang-0.8.18-2.9.noarch.rpm"
RPM_HASH = "bd49a7ca21894a3761611884dd8cd5bc51e6c6f171010acaf109947a3d358ab1090d2151061c80fda19ad1de08e567c20f7ccc3d820b19eb2c796bdf0e72c1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-lang \
compiz-lang-all \
locale-compiz-ar \
locale-compiz-bg \
locale-compiz-bn \
locale-compiz-bn-IN \
locale-compiz-ca \
locale-compiz-cs \
locale-compiz-da \
locale-compiz-de \
locale-compiz-el \
locale-compiz-en-GB \
locale-compiz-es \
locale-compiz-et \
locale-compiz-eu \
locale-compiz-fi \
locale-compiz-fr \
locale-compiz-gl \
locale-compiz-gu \
locale-compiz-he \
locale-compiz-hi \
locale-compiz-hr \
locale-compiz-hu \
locale-compiz-it \
locale-compiz-ja \
locale-compiz-ko \
locale-compiz-nb \
locale-compiz-nl \
locale-compiz-or \
locale-compiz-pa \
locale-compiz-pl \
locale-compiz-pt \
locale-compiz-pt-BR \
locale-compiz-ro \
locale-compiz-ru \
locale-compiz-sk \
locale-compiz-sl \
locale-compiz-sr \
locale-compiz-sv \
locale-compiz-ta \
locale-compiz-tr \
locale-compiz-uk \
locale-compiz-zh-CN \
locale-compiz-zh-TW"

RDEPENDS:${PN} += "compiz"

inherit rpm
