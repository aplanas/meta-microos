SUMMARY = "luna-pinyin input schema for rime"
DESCRIPTION = "luna-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-luna-pinyin-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "616aeda78ccbe048da642ea8e974e2e846ee9881a2a51557373f523f614edbb80e2510ee2dd4919fc47d888d5c82ee7bded804f37a19ab0282ac2f1912b71bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-luna-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
