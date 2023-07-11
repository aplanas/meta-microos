SUMMARY = "pinyin-simp input schema for rime"
DESCRIPTION = "pinyin-simp input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-pinyin-simp-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "ae9c27dcc378007908f04b408dd39f11234d6e3234095736d08422d60391b080c64e8ba1625bfc7e6316d89571bd5e5ead8e891ca7e7dcfb12c5dc94539b2716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-pinyin-simp"

RDEPENDS:${PN} += ""

inherit rpm
