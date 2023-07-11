SUMMARY = "Translations for package compiz-plugins-extra"
DESCRIPTION = "Provides translations for the 'compiz-plugins-extra' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-lang-0.8.18-1.16.noarch.rpm"
RPM_HASH = "0914f5dcbd48df6fa4aa4eddbd25aa19a10d51850d95107c2364ef4317e7f25573582d79a409971702c3e30a9547816de1878176938a0a3f74ac530564ddf4ef"
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
