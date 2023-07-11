SUMMARY = "Translations for package appstream-glib"
DESCRIPTION = "Provides translations for the 'appstream-glib' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "appstream-glib-lang-0.8.2-1.4.noarch.rpm"
RPM_HASH = "41ea08179bd0888d146536b335aaeb6a964a6912b67c12689bf11fb23730ca169c55064a241372191f44ae40e1b16641da9c78d70a8e155515ae29a6f9743a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appstream-glib-lang \
appstream-glib-lang-all \
locale-appstream-glib-ca \
locale-appstream-glib-cs \
locale-appstream-glib-da \
locale-appstream-glib-de \
locale-appstream-glib-en-GB \
locale-appstream-glib-es \
locale-appstream-glib-fa \
locale-appstream-glib-fi \
locale-appstream-glib-fr \
locale-appstream-glib-fur \
locale-appstream-glib-gl \
locale-appstream-glib-hr \
locale-appstream-glib-hu \
locale-appstream-glib-id \
locale-appstream-glib-it \
locale-appstream-glib-ka \
locale-appstream-glib-ko \
locale-appstream-glib-lt \
locale-appstream-glib-oc \
locale-appstream-glib-pl \
locale-appstream-glib-pt \
locale-appstream-glib-pt-BR \
locale-appstream-glib-ru \
locale-appstream-glib-sk \
locale-appstream-glib-sl \
locale-appstream-glib-sr \
locale-appstream-glib-sr@latin \
locale-appstream-glib-sv \
locale-appstream-glib-tr \
locale-appstream-glib-uk \
locale-appstream-glib-zh-CN \
locale-appstream-glib-zh-TW"

RDEPENDS:${PN} += "appstream-glib"

inherit rpm
