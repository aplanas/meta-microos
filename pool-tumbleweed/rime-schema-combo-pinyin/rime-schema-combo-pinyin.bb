SUMMARY = "combo-pinyin input schema for rime"
DESCRIPTION = "combo-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-combo-pinyin-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "9f5cb35eadf163fa748e615f4489ec008662d3652fa9d7912f0fbf13c060a27083b0e407b610c89b7463ba2e6c821ffe99d8612b5bcd95df472020d4062f1ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-combo-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
