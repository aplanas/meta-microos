SUMMARY = "Extra collection of rime schemas"
DESCRIPTION = "Extra collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-extra-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "1432555444ee04af2e12507d1be9c82593a34e6d09946c28968ecd12f983925a5eee57a49def152e035e0d736fbb3567fe1c73a9d8e303d15ff98fda2dc90dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-extra"

RDEPENDS:${PN} += "rime-schema-array \
rime-schema-cantonese \
rime-schema-combo-pinyin \
rime-schema-double-pinyin \
rime-schema-emoji \
rime-schema-essay-simp \
rime-schema-ipa \
rime-schema-middle-chinese \
rime-schema-pinyin-simp \
rime-schema-quick \
rime-schema-scj \
rime-schema-soutzoe \
rime-schema-stenotype \
rime-schema-wubi \
rime-schema-wugniu"

inherit rpm
