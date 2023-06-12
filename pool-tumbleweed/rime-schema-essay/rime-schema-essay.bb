SUMMARY = "essay input schema for rime"
DESCRIPTION = "essay input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-essay-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "fe61c07261da2c68723c801677ee4169cb662bf83f77ee89f781a045535ba72cac41ece89e52cf9f731ca9d9b09b5fae5d371ac93fb15e7d64a8917d017c2076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay"
RDEPENDS:${PN} += ""

inherit rpm
