SUMMARY = "Translations for package lookbook"
DESCRIPTION = "Provides translations for the 'lookbook' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "lookbook-lang-1.2.0-1.10.noarch.rpm"
RPM_HASH = "27eebc7efbcebf0274dcc3a6e0d911bfc7652233073322c4ca414c2e65ffec26de4bd72229cebffb4e260eab1ad3b434c30019182263bee83d3bca385fbdf4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lookbook-fr \
locale-lookbook-pt \
lookbook-lang \
lookbook-lang-all"

RDEPENDS:${PN} += "lookbook"

inherit rpm
