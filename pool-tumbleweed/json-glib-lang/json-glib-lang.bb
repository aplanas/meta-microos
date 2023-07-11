SUMMARY = "Translations for package json-glib"
DESCRIPTION = "Provides translations for the 'json-glib' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "json-glib-lang-1.6.6-2.9.noarch.rpm"
RPM_HASH = "17db321500cf71262ebace35a32adb5616636c80fc2f6746612d13c0c10b3ad00e223be0f9faf164e5407791dcc45ca5cbce7f1a3d9c661308ac4e6898b68ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-glib-lang \
json-glib-lang-all \
locale-json-glib-as \
locale-json-glib-be \
locale-json-glib-bg \
locale-json-glib-bn-IN \
locale-json-glib-bs \
locale-json-glib-ca \
locale-json-glib-ca@valencia \
locale-json-glib-cs \
locale-json-glib-da \
locale-json-glib-de \
locale-json-glib-el \
locale-json-glib-en-GB \
locale-json-glib-eo \
locale-json-glib-es \
locale-json-glib-et \
locale-json-glib-eu \
locale-json-glib-fr \
locale-json-glib-fur \
locale-json-glib-gl \
locale-json-glib-he \
locale-json-glib-hi \
locale-json-glib-hr \
locale-json-glib-hu \
locale-json-glib-id \
locale-json-glib-it \
locale-json-glib-ja \
locale-json-glib-ko \
locale-json-glib-lt \
locale-json-glib-lv \
locale-json-glib-ml \
locale-json-glib-ms \
locale-json-glib-nb \
locale-json-glib-ne \
locale-json-glib-nl \
locale-json-glib-oc \
locale-json-glib-or \
locale-json-glib-pa \
locale-json-glib-pl \
locale-json-glib-pt \
locale-json-glib-pt-BR \
locale-json-glib-ro \
locale-json-glib-ru \
locale-json-glib-sk \
locale-json-glib-sl \
locale-json-glib-sr \
locale-json-glib-sr@latin \
locale-json-glib-sv \
locale-json-glib-te \
locale-json-glib-tr \
locale-json-glib-ug \
locale-json-glib-uk \
locale-json-glib-vi \
locale-json-glib-zh-CN \
locale-json-glib-zh-HK \
locale-json-glib-zh-TW"

RDEPENDS:${PN} += "json-glib"

inherit rpm
