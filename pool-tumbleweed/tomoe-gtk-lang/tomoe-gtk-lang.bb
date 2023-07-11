SUMMARY = "Translations for package tomoe-gtk"
DESCRIPTION = "Provides translations for the 'tomoe-gtk' package."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-lang-0.6.0-44.25.noarch.rpm"
RPM_HASH = "b9c25ec9044d5cdde0bb5441733571595c27793d4ddab49f6b7f77d00eae7cbb7d9fa30d48eab3157aa3dcbbb92ab66ca63ef4afd23cf6f8efc5138e3612f2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tomoe-gtk-ja \
tomoe-gtk-lang \
tomoe-gtk-lang-all"

RDEPENDS:${PN} += "tomoe-gtk"

inherit rpm
