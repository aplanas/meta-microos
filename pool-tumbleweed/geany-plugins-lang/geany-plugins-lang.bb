SUMMARY = "Translations for package geany-plugins"
DESCRIPTION = "Provides translations for the 'geany-plugins' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "geany-plugins-lang-1.38-3.5.noarch.rpm"
RPM_HASH = "323c7f1967740375f8e0fdb52f08a717c630f96a0c4b6177690b5f08488f5cdb61a7c6e2d5a3d0ca2c4f3e876410063927ffc53bd39a09ce92c76c75526a71e3"
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
