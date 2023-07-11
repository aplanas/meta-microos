SUMMARY = "Translations for package lookbook"
DESCRIPTION = "Provides translations for the 'lookbook' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "lookbook-lang-1.2.0-1.11.noarch.rpm"
RPM_HASH = "8d254ac8e7a3337b44b15c9283cdec384735c55317e2ba8d7203786c2ba40b84101e4d19e7c87d8f309119f09d772d511ec3d636a5bd963cc1cb76998c11ffb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lookbook-fr \
locale-lookbook-pt \
lookbook-lang \
lookbook-lang-all"

RDEPENDS:${PN} += "lookbook"

inherit rpm
