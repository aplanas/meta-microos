SUMMARY = "double-pinyin input schema for rime"
DESCRIPTION = "double-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-double-pinyin-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "18896657594383cf06d58d68e61f5a393a5b1236b5a8fab7a5695a196db0e458f272f1b937f8f350b6d1e1db2c6d76bd860c120521aa4b6e54b4254cc75b813f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-double-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
