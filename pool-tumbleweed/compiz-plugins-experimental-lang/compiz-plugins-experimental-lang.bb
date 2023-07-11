SUMMARY = "Translations for package compiz-plugins-experimental"
DESCRIPTION = "Provides translations for the 'compiz-plugins-experimental' package."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-experimental-lang-0.8.18-1.17.noarch.rpm"
RPM_HASH = "17c4b6306d28e2deaf317d48eee686a7b97b894a8dcd2a31a530805a9d3cb105e44bba967e87fb6c44d5be57d97f91a3187874dbc3f93318672cb1e13469d090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-plugins-experimental-lang \
compiz-plugins-experimental-lang-all \
locale-compiz-plugins-experimental-ar \
locale-compiz-plugins-experimental-bn \
locale-compiz-plugins-experimental-ca \
locale-compiz-plugins-experimental-cs \
locale-compiz-plugins-experimental-de \
locale-compiz-plugins-experimental-el \
locale-compiz-plugins-experimental-en-GB \
locale-compiz-plugins-experimental-es \
locale-compiz-plugins-experimental-eu \
locale-compiz-plugins-experimental-fi \
locale-compiz-plugins-experimental-fr \
locale-compiz-plugins-experimental-gl \
locale-compiz-plugins-experimental-gu \
locale-compiz-plugins-experimental-he \
locale-compiz-plugins-experimental-hi \
locale-compiz-plugins-experimental-hu \
locale-compiz-plugins-experimental-it \
locale-compiz-plugins-experimental-ja \
locale-compiz-plugins-experimental-ko \
locale-compiz-plugins-experimental-nb \
locale-compiz-plugins-experimental-nl \
locale-compiz-plugins-experimental-pl \
locale-compiz-plugins-experimental-pt \
locale-compiz-plugins-experimental-pt-BR \
locale-compiz-plugins-experimental-ru \
locale-compiz-plugins-experimental-sv \
locale-compiz-plugins-experimental-tr \
locale-compiz-plugins-experimental-zh-CN"

RDEPENDS:${PN} += "compiz-plugins-experimental"

inherit rpm
