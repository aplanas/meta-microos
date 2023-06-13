SUMMARY = "terra-pinyin input schema for rime"
DESCRIPTION = "terra-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-terra-pinyin-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "c716f4534ef5aacaa0cfaca4f0b7e6cd8321f1f67b20008f412406f5eead2b8bd061292db8df5f955bb4be152a9b266d2e3938114a8dca809efd8570bc0b873c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-terra-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
