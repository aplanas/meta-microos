SUMMARY = "Translations for package scim"
DESCRIPTION = "Provides translations for the 'scim' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-lang-1.4.18-5.11.noarch.rpm"
RPM_HASH = "c6710534cd1ed28191ac6f39304b476802270409bde1727705712c19635628c433e7891ae2140c2e901c383a4effe0550a3dae0e47906ab88e23adb98a43555a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-scim-as \
locale-scim-bn-IN \
locale-scim-ca \
locale-scim-cs \
locale-scim-de \
locale-scim-es \
locale-scim-fi \
locale-scim-fr \
locale-scim-gu \
locale-scim-hi \
locale-scim-it \
locale-scim-ja \
locale-scim-kn \
locale-scim-ko \
locale-scim-ml \
locale-scim-mr \
locale-scim-nl \
locale-scim-pa \
locale-scim-pt-BR \
locale-scim-ru \
locale-scim-sk \
locale-scim-sv \
locale-scim-ta \
locale-scim-te \
locale-scim-vi \
locale-scim-zh-CN \
locale-scim-zh-TW \
scim-lang \
scim-lang-all"

RDEPENDS:${PN} += "scim"

inherit rpm
