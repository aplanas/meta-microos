SUMMARY = "terra-pinyin input schema for rime"
DESCRIPTION = "terra-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-terra-pinyin-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "c548b171d94ffe9d612329ff70b59efdcd9fbe9da6b179308d360c55db1831a9896b4aaeabcb223858dae069e11b9b4a389cde9f945dabe935441145b238dd23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-terra-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
