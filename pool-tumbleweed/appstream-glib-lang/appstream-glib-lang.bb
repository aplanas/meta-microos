SUMMARY = "Translations for package appstream-glib"
DESCRIPTION = "Provides translations for the 'appstream-glib' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "appstream-glib-lang-0.8.2-1.3.noarch.rpm"
RPM_HASH = "2375c29b292e62637696a66dc7fefb51a082e575002132e8e5fa3a96479c5a117e7363e1214369db6aae9d84d94ec3bc3857e79e6e48cba654b3051c5ea65e67"
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
