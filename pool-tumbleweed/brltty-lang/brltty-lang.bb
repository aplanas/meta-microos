SUMMARY = "Translations for package brltty"
DESCRIPTION = "Provides translations for the 'brltty' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-lang-6.6-1.1.noarch.rpm"
RPM_HASH = "eee7375b4972d4224a499798f690fcffa35ee8638b21ed3b02b96d0c422da423c1ec1b60d39b4c293ec8b9104dbb79106739fa46b2bef8255bf51f45f8fd0db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brltty-lang \
brltty-lang-all \
locale-brltty-ar \
locale-brltty-de \
locale-brltty-fr \
locale-brltty-it \
locale-brltty-ru \
locale-brltty-zh"

RDEPENDS:${PN} += "brltty"

inherit rpm
