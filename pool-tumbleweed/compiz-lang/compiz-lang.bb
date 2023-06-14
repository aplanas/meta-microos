SUMMARY = "Translations for package compiz"
DESCRIPTION = "Provides translations for the 'compiz' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-lang-0.8.18-2.8.noarch.rpm"
RPM_HASH = "ee1b15180cb7fd4061e307be0f545e21665959d0a30cfab5c39408dc3b9cc5fd586400d719f5b6f80c6258211eabaed9966f050bdd71e8e53c7cb0b809482660"
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
