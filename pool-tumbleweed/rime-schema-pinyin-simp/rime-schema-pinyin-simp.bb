SUMMARY = "pinyin-simp input schema for rime"
DESCRIPTION = "pinyin-simp input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-pinyin-simp-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "43a49421edd56d07d528631ef5858862cd3470db13a3a13b90996e116939d5272a730206dfdbe24d650c8d6e5b3560800a0fb0b53af5ba7cc9c75da625b223df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-pinyin-simp"

RDEPENDS:${PN} += ""

inherit rpm
