SUMMARY = "Translations for package gpick"
DESCRIPTION = "Provides translations for the 'gpick' package."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "gpick-lang-0.2.5-11.16.noarch.rpm"
RPM_HASH = "4a39f00af3b23db963f4b2deb5d8b0eb4598fae4aff44dc80c8e822f652c81158aa9f5d0d754da68c8bee67f729d53cb8fdeec4645c2fcceea1f96077844e48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpick-lang \
gpick-lang-all \
locale-gpick-es \
locale-gpick-lt \
locale-gpick-ru"

RDEPENDS:${PN} += "gpick"

inherit rpm
