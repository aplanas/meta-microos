SUMMARY = "prelude input schema for rime"
DESCRIPTION = "prelude input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-prelude-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "777026c1baa1ed814fcacd6a56688cd308c0e9c29aafb6cbd3901ae54356090d3cb57870ae3e864b621d990d4ac71e51ee6e515e694201525acfd127e5d11125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-prelude"

RDEPENDS:${PN} += ""

inherit rpm
