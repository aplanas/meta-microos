SUMMARY = "quick input schema for rime"
DESCRIPTION = "quick input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-quick-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "1d2046b7c2d54fe030c01e772dd28409d91cf1cbec7b6b13417d5fa86e28889d3ee5f44de794954922192d9e9c23920863a2793be07f9a616910567179def482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-quick"

RDEPENDS:${PN} += ""

inherit rpm
