SUMMARY = "double-pinyin input schema for rime"
DESCRIPTION = "double-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-double-pinyin-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "e6c459ef962c5198e327569445bf51f06b31f237ab25d70b7f936aae6dd2864bf32b02025f317cdf89c058a257b8fd476563ee302c8cac1610c087b5192b1cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-double-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
