SUMMARY = "Translations for package liblinphone"
DESCRIPTION = "Provides translations for the 'liblinphone' package."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone-lang-5.2.50-1.1.noarch.rpm"
RPM_HASH = "27cbaa0e3ed6c43e06149d3ea788cb8b2dd531ee2cd995c4a31c2a237c7531bf2af7a10f9b09d8de9d1c0d48964d65d71f13b1ec4f0f9af4d08c281e5d500d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-lang \
liblinphone-lang-all"
RDEPENDS:${PN} += "liblinphone"

inherit rpm
