SUMMARY = "simplified essay input schema for rime"
DESCRIPTION = "simplified essay input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-essay-simp-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "89dd7981503490d195002a69c63abdc0a6083f11f158d3896c6b7ff04a6a8eb1a92d10d7da924e5d18b8d78239ca9e1811c250f63fc130e6ffa3b8a98ab7c103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay-simp"

RDEPENDS:${PN} += ""

inherit rpm
