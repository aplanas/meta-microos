SUMMARY = "Translations for package geany-plugins"
DESCRIPTION = "Provides translations for the 'geany-plugins' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "geany-plugins-lang-1.38-3.6.noarch.rpm"
RPM_HASH = "7ca265afda521d2e07537adef61caa2992a1354d712c5b1465dde78fff63078b5e13ca06149752b32a47d959f9843df7c13236fbdd0209c1aa42008ffbecf230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geany-plugins-lang \
geany-plugins-lang-all \
locale-geany-plugins-be \
locale-geany-plugins-ca \
locale-geany-plugins-da \
locale-geany-plugins-de \
locale-geany-plugins-el \
locale-geany-plugins-es \
locale-geany-plugins-fr \
locale-geany-plugins-gl \
locale-geany-plugins-it \
locale-geany-plugins-ja \
locale-geany-plugins-kk \
locale-geany-plugins-nl \
locale-geany-plugins-pt \
locale-geany-plugins-pt-BR \
locale-geany-plugins-ru \
locale-geany-plugins-tr \
locale-geany-plugins-uk \
locale-geany-plugins-zh-CN"

RDEPENDS:${PN} += "geany-plugins"

inherit rpm
