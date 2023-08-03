SUMMARY = "Translations for package geany-plugins"
DESCRIPTION = "Provides translations for the 'geany-plugins' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "geany-plugins-lang-1.38-3.7.noarch.rpm"
RPM_HASH = "b821e70b0e56a66754d2f3b40d7ca97ac3b19cb07b4b5a1e61e3cb3012c5673ae917c289f2006869f5e219a899b5d48eed1ea1fa5a08071c6d807014fe3bdb7f"
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
