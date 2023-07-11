SUMMARY = "emoji input schema for rime"
DESCRIPTION = "emoji input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-emoji-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "91474dcd0e2f14df9bd040918edbc3b6a2dd9beed2f85828280c1d20124d90ce79cc3b9a9de043b1ae0d6b3640add2e526f73fe5ba6ec6ce957829c29631837a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-emoji"

RDEPENDS:${PN} += ""

inherit rpm
