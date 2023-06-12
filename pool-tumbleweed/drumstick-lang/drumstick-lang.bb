SUMMARY = "Translations for package drumstick"
DESCRIPTION = "Provides translations for the 'drumstick' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-lang-2.7.2-1.3.noarch.rpm"
RPM_HASH = "1b8738246bf5fb9d54bcc42d448246cea838d8aa4e4156d8058ab743bf005ad4e0d708e4e8106f17a2bd8484513ccd7d77bfe5980fc7257af26076ef1dc7ac1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drumstick-lang \
drumstick-lang-all"
RDEPENDS:${PN} += "drumstick"

inherit rpm
