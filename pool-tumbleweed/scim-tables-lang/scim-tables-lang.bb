SUMMARY = "Translations for package scim-tables"
DESCRIPTION = "Provides translations for the 'scim-tables' package."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-lang-0.5.14.1-2.32.noarch.rpm"
RPM_HASH = "acf2d39b33a4d8ed39b5c24b9e5d6d59b48eb76fd80e52a5dfd6cc519927b1f1de9739549d624bac9fe448eca1f787c31fc7978cb535646f6c1d8ffcd0c16b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-scim-tables-de \
locale-scim-tables-fr \
locale-scim-tables-it \
locale-scim-tables-ja \
locale-scim-tables-ko \
locale-scim-tables-nl \
locale-scim-tables-pa \
locale-scim-tables-zh-CN \
locale-scim-tables-zh-TW \
scim-tables-lang \
scim-tables-lang-all"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
