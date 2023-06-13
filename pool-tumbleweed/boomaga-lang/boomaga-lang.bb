SUMMARY = "Translations for package boomaga"
DESCRIPTION = "Provides translations for the 'boomaga' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "boomaga-lang-3.0.0-3.11.noarch.rpm"
RPM_HASH = "ff4018daa3da3e613d201c69339dd4d51d030739da3723f4ffa974663da612068bb3bf181a2ac18e3532605241ffdb54be8dcfec671312079317188d187f2b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boomaga-lang \
boomaga-lang-all"

RDEPENDS:${PN} += "boomaga"

inherit rpm
