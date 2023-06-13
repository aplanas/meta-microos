SUMMARY = "Default/Preset collection of rime schemas"
DESCRIPTION = "Default/Preset collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-default-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "7dc727aeb338007ab9cc4472191ee9ff09d9fbd8ae56d906b06d12ca222aa0d88924a48c8ae45a6fa133a47651ea3411a8591928a7a554d3ea011474a9fcdb8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-default"

RDEPENDS:${PN} += "rime-schema-bopomofo \
rime-schema-cangjie \
rime-schema-custom \
rime-schema-essay \
rime-schema-luna-pinyin \
rime-schema-prelude \
rime-schema-stroke \
rime-schema-terra-pinyin"

inherit rpm
